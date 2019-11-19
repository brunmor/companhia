package com.grupo14.companhia_aerea.controlador;

import com.grupo14.companhia_aerea.dominio.Aeroporto;
import com.grupo14.companhia_aerea.servico.aeroporto.AeroportoDTO;
import com.grupo14.companhia_aerea.servico.aeroporto.AeroportoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<AeroportoDTO> buscarAeroportos() {
        List<Aeroporto> aeros = this.aeroportoService.buscarTodos();
        List<AeroportoDTO> aerosDTO = new ArrayList<>();
        aeros.forEach(aeroporto -> {
            AeroportoDTO aeroportoDTO = new AeroportoDTO();
            aeroportoDTO.mapearParaDTO(aeroporto);
            aerosDTO.add(aeroportoDTO);
        });

        return aerosDTO;
    }
}
