package com.grupo14.companhia_aerea.servico.voo;

import com.grupo14.companhia_aerea.dominio.voo.Voo;
import com.grupo14.companhia_aerea.dominio.voo.VooService;
import com.grupo14.companhia_aerea.repositorio.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VooServiceImpl implements VooService {

    @Autowired
    VooRepository vooRepository;

    public List<VooDTO> listarVoos(){

        List<Voo> voos = vooRepository.findAll();

        List<VooDTO> voosDtos = new ArrayList<>();

        for (Voo voo: voos) {
            voosDtos.add(new VooDTO());
        }
        return voosDtos;

    }

}
