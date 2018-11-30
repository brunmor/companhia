package com.grupo14.companhia_aerea.controlador;

import com.grupo14.companhia_aerea.servico.AeroportoDTO;
import com.grupo14.companhia_aerea.servico.AeroportoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aeroporto")
public class AeroportoController {

    private final AeroportoService aeroportoService;

    @Autowired
    public AeroportoController(AeroportoService aeroportoService) {
        this.aeroportoService = aeroportoService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void adicionar(@RequestBody AeroportoDTO aeroportoDTO) {
        this.aeroportoService.adicionar(aeroportoDTO);
    }
}
