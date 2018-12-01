package com.grupo14.companhia_aerea.controlador;

import com.grupo14.companhia_aerea.dominio.voo.GeradorDeVoos;
import com.grupo14.companhia_aerea.dominio.voo.Voo;
import com.grupo14.companhia_aerea.servico.aeroporto.AeroportoService;
import com.grupo14.companhia_aerea.servico.companhiaAerea.CompanhiaAereaService;
import com.grupo14.companhia_aerea.servico.voo.VooDTO;
import com.grupo14.companhia_aerea.servico.voo.VooServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voos")
public class VooController {

    @Autowired
    private VooServiceImpl vooService;

    @Autowired
    private CompanhiaAereaService companhiaService;

    @Autowired
    private AeroportoService aeroportoService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<VooDTO> listarVoos(){
        return vooService.listarVoos();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void adicionarVoo(@RequestBody VooDTO vooDTO){
        vooService.adicionaVoo(vooDTO);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public VooDTO listarVoo(@PathVariable Long id){
        return vooService.buscaVoo(id);
    }

    @RequestMapping(value = "/{n}", method = RequestMethod.PUT)
    public void adicionarVoosAleatorios(@RequestBody int n) {
        GeradorDeVoos gerador = new GeradorDeVoos(companhiaService, aeroportoService);
        for (int i = 0; i < n; i++) {
            Voo voo = gerador.criarVoo();
            vooService.adicionaVoo(vooService.mapearVooParaVooDTO(voo));
        }
    }

//    @RequestMapping(value = "/cidadesDeDestino", method = RequestMethod.GET)
//    @ResponseBody
//    public List<String> buscarCidadesDeDestino() { return vooService.buscarCidadesDeDestino(); }
//
//    @RequestMapping(value = "/buscarVoosPorDestino/{cidadeDestino}", method = RequestMethod.GET)
//    @ResponseBody
//    public List<Voo> buscarVoosPorDestino(@PathVariable String cidadeDestino) { return vooService.buscarVoosPorDestino(cidadeDestino); }
}
