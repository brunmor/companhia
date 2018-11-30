package com.grupo14.companhia_aerea.controlador;

import com.grupo14.companhia_aerea.servico.CompanhiaAereaDTO;
import com.grupo14.companhia_aerea.servico.CompanhiaAereaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companhiaAerea")
public class CompanhiaAereaController {

    private final CompanhiaAereaService companhiaAereaService;

    @Autowired
    public CompanhiaAereaController(CompanhiaAereaService companhiaAereaService) {
        this.companhiaAereaService = companhiaAereaService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void adicionar(@RequestBody CompanhiaAereaDTO companhiaAereaDTO) {
        this.companhiaAereaService.adicionar(companhiaAereaDTO);
    }
}
