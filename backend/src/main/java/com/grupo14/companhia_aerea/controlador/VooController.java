package com.grupo14.companhia_aerea.controlador;

import com.grupo14.companhia_aerea.dominio.voo.VooService;
import com.grupo14.companhia_aerea.servico.voo.VooDTO;
import com.grupo14.companhia_aerea.servico.voo.VooServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/voo")
public class VooController {

    @Autowired
    VooService vooService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<VooDTO> listarVoos(){
        return vooService.listarVoos();
    }


}
