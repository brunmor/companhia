package com.grupo14.companhia_aerea.dominio.voo;

import com.grupo14.companhia_aerea.servico.voo.VooDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VooService {
    List<VooDTO> listarVoos();
}
