package com.grupo14.companhia_aerea.servico;

import com.grupo14.companhia_aerea.dominio.Comprador;
import com.grupo14.companhia_aerea.repositorio.CompradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CompradorService {

    @Autowired
    CompradorRepository compradorRepository;


}
