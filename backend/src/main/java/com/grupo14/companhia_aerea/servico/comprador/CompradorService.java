package com.grupo14.companhia_aerea.servico.comprador;

import com.grupo14.companhia_aerea.dominio.Comprador;
import com.grupo14.companhia_aerea.repositorio.CompradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompradorService {

    private final CompradorRepository compradorRepository;

    @Autowired
    public CompradorService(CompradorRepository compradorRepository) {
        this.compradorRepository = compradorRepository;
    }

    public void adicionar(CompradorDTO compradorDTO) {
        Comprador comprador = compradorDTO.mapearParaComprador();
        compradorRepository.save(comprador);
    }

    public CompradorDTO buscarPorCpf(String cpf) {
        Comprador compradorRetornado = compradorRepository.buscarPorCpf(cpf);

        if (compradorRetornado != null) {
            CompradorDTO comprador = new CompradorDTO();
            comprador.mapearParaDTO(compradorRepository.buscarPorCpf(cpf));
            return comprador;
        }

        return null;
    }
}
