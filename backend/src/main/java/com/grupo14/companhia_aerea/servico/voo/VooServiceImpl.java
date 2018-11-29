package com.grupo14.companhia_aerea.servico.voo;

import com.grupo14.companhia_aerea.dominio.voo.Voo;
import com.grupo14.companhia_aerea.dominio.voo.VooService;
import com.grupo14.companhia_aerea.repositorio.VooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VooServiceImpl implements VooService {

    @Autowired
    VooRepository vooRepository;

    public List<VooDTO> listarVoos(){

        List<Voo> voos = vooRepository.findAll();

        List<VooDTO> voosDtos = new ArrayList<>();

        for (Voo voo: voos) {
            VooDTO vooDTO = new VooDTO();
            vooDTO = mapearVooParaVooDTO(voo);
            voosDtos.add(vooDTO);

        }
        return voosDtos;

    }

    @Override
    public void adicionaVoo(VooDTO vooDTO) {
        Voo voo = mapearVooDTOParaVoo(vooDTO);

        vooRepository.save(voo);
    }

    @Override
    public VooDTO buscaVoo(Long id) {
        Voo voo = vooRepository.findById(id).get();

        VooDTO vooDTO = mapearVooParaVooDTO(voo);

        return vooDTO;
    }

    public List<String> buscarCidadesDeDestino() {
        List<String> cidadesDeDestino;
        cidadesDeDestino = vooRepository.buscarCidadesDeDestino();

        return cidadesDeDestino;
    }

    private Voo mapearVooDTOParaVoo(VooDTO vooDTO) {


        Voo voo = new Voo(vooDTO.getCidadeDeOrigem(),
                vooDTO.getCidadeDeDestino(), LocalDate.of(retornaAno(vooDTO.getDataDeIda()),
                retornaMes(vooDTO.getDataDeIda()), retornaDia(vooDTO.getDataDeIda())),
                LocalDate.of(retornaAno(vooDTO.getDataDeVolta()), retornaMes(vooDTO.getDataDeVolta()),
                retornaDia(vooDTO.getDataDeVolta())), vooDTO.getPreco());

        return voo;
    }


    private VooDTO mapearVooParaVooDTO(Voo voo) {
        VooDTO vooDTO = new VooDTO();
        vooDTO.setCidadeDeOrigem(voo.getCidadeDeOrigem());
        vooDTO.setCidadeDeDestino(voo.getCidadeDeDestino());
        vooDTO.setDataDeIda(voo.getDataDeIda().toString());
        vooDTO.setDataDeVolta(voo.getDataDeVolta().toString());
        vooDTO.setAssentos(voo.getAssentos());
        vooDTO.setPreco(voo.getPreco());

        return vooDTO;

    }

    private int retornaAno(String data) { return Integer.parseInt(data.split("-")[0]); }
    private int retornaMes(String data){
        return Integer.parseInt(data.split("-")[1]);
    }
    private int retornaDia(String data){
        return Integer.parseInt(data.split("-")[2]);
    }
}
