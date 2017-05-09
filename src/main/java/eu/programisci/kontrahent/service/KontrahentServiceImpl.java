package eu.programisci.kontrahent.service;

import eu.programisci.kontrahent.converters.KontrahentCoverter;
import eu.programisci.kontrahent.dto.KontrahentDTO;
import eu.programisci.kontrahent.dto.KontrahentForTableDTO;
import eu.programisci.kontrahent.ob.KontrahentOB;
import eu.programisci.kontrahent.repository.IKontrahentRepository;
import eu.programisci.kontrahent.service.IKontrahentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class KontrahentServiceImpl implements IKontrahentService {

    @Autowired
    private IKontrahentRepository kontrahentRepository;

    @Autowired
    private KontrahentCoverter kontrahentCoverter;

    @Override
    public KontrahentDTO findOne(Long id) {
        KontrahentOB ob = kontrahentRepository.findOne(id);
        KontrahentDTO dto = kontrahentCoverter.obToDto(ob);
        return dto;
    }

    @Override
    public List<KontrahentForTableDTO> findAllForTablee() {
        List<KontrahentOB> obList = kontrahentRepository.findAll();
        List<KontrahentForTableDTO> dtoList = kontrahentCoverter.kontrahentObToUserForTable(obList);
        return dtoList;
    }

    @Override
    public void deleteOne(Long id) {
        kontrahentRepository.delete(id);
    }

    @Override
    public KontrahentDTO save(KontrahentDTO dto) {
        if (dto.getId() == null) {
            return kontrahentCoverter.obToDto(create(dto));
        } else {
            return kontrahentCoverter.obToDto(update(dto));
        }
    }

    private KontrahentOB create(KontrahentDTO dto) {
        KontrahentOB ob = kontrahentCoverter.dtoToOb(dto);
        ob.setCreationDate(new Date());
        ob = kontrahentRepository.save(ob);
        return ob;
    }

    private KontrahentOB update(KontrahentDTO dto) {
        KontrahentOB ob = kontrahentRepository.findOne(dto.getId());
        ob.setNip(dto.getNip());
        ob.setAdres(dto.getAdres());
        ob.setName(dto.getName());
        ob = kontrahentRepository.save(ob);
        return ob;
    }
}
