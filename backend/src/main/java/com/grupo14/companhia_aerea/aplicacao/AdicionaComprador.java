package com.grupo14.companhia_aerea.aplicacao;

import com.grupo14.companhia_aerea.dominio.Comprador;
import com.grupo14.companhia_aerea.repositorio.CompradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AdicionaComprador {

    private final CompradorRepository compradorRepository;

    @Autowired
    public AdicionaComprador(CompradorRepository compradorRepository) {
        this.compradorRepository = compradorRepository;
    }

    public void adicionar(CompradorDTO compradorDTO) {
        Comprador comprador = compradorDTO.mapearParaComprador();
        compradorRepository.save(comprador);
    }
}
