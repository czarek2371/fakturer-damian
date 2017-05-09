package eu.programisci.kontrahent.service;

import eu.programisci.kontrahent.dto.KontrahentDTO;
import eu.programisci.kontrahent.dto.KontrahentForTableDTO;

import java.util.List;

public interface IKontrahentService {

    KontrahentDTO findOne(Long id);

    List<KontrahentForTableDTO> findAllForTablee();

    void deleteOne(Long id);

    KontrahentDTO save(KontrahentDTO kontrahentDTO);
}
