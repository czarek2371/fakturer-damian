package eu.programisci.kontrahent.converters;

import eu.programisci.kontrahent.dto.KontrahentDTO;
import eu.programisci.kontrahent.dto.KontrahentForTableDTO;
import eu.programisci.kontrahent.ob.KontrahentOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KontrahentCoverter {

    public KontrahentDTO obToDto(KontrahentOB in) {
        KontrahentDTO out = new KontrahentDTO();
        out.setId(in.getId());
        out.setCreationDate(in.getCreationDate());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        out.setName(in.getName());
        return out;
    }

    public KontrahentOB dtoToOb(KontrahentDTO in) {
        KontrahentOB out = new KontrahentOB();
        out.setId(in.getId());
        out.setCreationDate(in.getCreationDate());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        out.setName(in.getName());
        return out;
    }


    public List<KontrahentForTableDTO> kontrahentObToUserForTable(List<KontrahentOB> inList) {
        if (inList == null) {
            return null;
        }
        List<KontrahentForTableDTO> outList = new ArrayList<>();
        for (KontrahentOB in : inList) {
            outList.add(kontrahentObToUserForTable(in));
        }
        return outList;
    }

    private KontrahentForTableDTO kontrahentObToUserForTable(KontrahentOB in) {
        KontrahentForTableDTO out = new KontrahentForTableDTO();
        out.setId(in.getId());
        out.setCreationDate(in.getCreationDate());
        out.setAdres(in.getAdres());
        out.setName(in.getName());
        out.setNip(in.getNip());
        return out;
    }
}
