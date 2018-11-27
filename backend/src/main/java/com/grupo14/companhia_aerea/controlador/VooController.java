package com.grupo14.companhia_aerea.controlador;

import com.grupo14.companhia_aerea.servico.voo.VooDTO;
import com.grupo14.companhia_aerea.servico.voo.VooServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voos")
public class VooController {

    @Autowired
    VooServiceImpl vooService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<VooDTO> listarVoos(){
        return vooService.listarVoos();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void adicionarVoo(@RequestBody VooDTO vooDTO){
        vooService.adicionaVoo(vooDTO);
    }

}
