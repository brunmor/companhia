package com.grupo14.companhia_aerea.controlador;

import com.grupo14.companhia_aerea.servico.comprador.CompradorDTO;
import com.grupo14.companhia_aerea.servico.comprador.CompradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comprador")
@CrossOrigin(origins={"*"})
public class CompradorController {

    private final CompradorService compradorService;

    @Autowired
    public CompradorController(CompradorService compradorService) {
        this.compradorService = compradorService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void adicionar(@RequestBody CompradorDTO compradorDTO) {
        this.compradorService.adicionar(compradorDTO);
    }

    @RequestMapping(value = "/{cpf}", method = RequestMethod.GET)
    @ResponseBody
    public CompradorDTO buscarPorCpf(@PathVariable("cpf") String cpf) {
        return this.compradorService.buscarPorCpf(cpf);
    }
}
