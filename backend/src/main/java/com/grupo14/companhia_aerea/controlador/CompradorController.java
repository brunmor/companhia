package com.grupo14.companhia_aerea.controlador;

import com.grupo14.companhia_aerea.aplicacao.AdicionaComprador;
import com.grupo14.companhia_aerea.aplicacao.CompradorDTO;
import com.grupo14.companhia_aerea.repositorio.CompradorRepository;
import com.grupo14.companhia_aerea.servico.CompradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comprador")
@CrossOrigin(origins={"*"})
public class CompradorController {

    private final AdicionaComprador adicionaComprador;

    @Autowired
    public CompradorController(AdicionaComprador adicionaComprador) {
        this.adicionaComprador = adicionaComprador;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void adicionar(@RequestBody CompradorDTO compradorDTO) {
        this.adicionaComprador.adicionar(compradorDTO);
    }

}
