package com.grupo14.companhia_aerea.servico;

import com.grupo14.companhia_aerea.dominio.CompanhiaAerea;
import com.grupo14.companhia_aerea.repositorio.CompanhiaAereaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanhiaAereaService {

    private final CompanhiaAereaRepository companhiaAereaRepository;

    @Autowired
    public CompanhiaAereaService(CompanhiaAereaRepository companhiaAereaRepository) {
        this.companhiaAereaRepository = companhiaAereaRepository;
    }

    public void adicionar(CompanhiaAereaDTO companhiaAereaDTO) {
        CompanhiaAerea companhiaAerea = companhiaAereaDTO.mapearParaCompanhia();
        companhiaAereaRepository.save(companhiaAerea);
    }
}
