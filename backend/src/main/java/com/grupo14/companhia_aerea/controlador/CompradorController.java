package com.grupo14.companhia_aerea.controlador;

import com.grupo14.companhia_aerea.servico.CompradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/comprador")
public class CompradorController {

    @Autowired
    CompradorService compradorService;

}
