package com.grupo14.companhia_aerea.servico.aeroporto;

import com.grupo14.companhia_aerea.dominio.Aeroporto;
import com.grupo14.companhia_aerea.repositorio.AeroportoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AeroportoService {

    private final AeroportoRepository aeroportoRepository;

    @Autowired
    public AeroportoService(AeroportoRepository aeroportoRepository) {
        this.aeroportoRepository = aeroportoRepository;
    }

    public void adicionar(AeroportoDTO aeroportoDTO) {
        Aeroporto aeroporto = aeroportoDTO.mapearParaAeroporto();
        aeroportoRepository.save(aeroporto);
    }
}
