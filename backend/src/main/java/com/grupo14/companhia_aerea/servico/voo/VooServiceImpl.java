package com.grupo14.companhia_aerea.servico.voo;

import com.grupo14.companhia_aerea.dominio.Aeroporto;
import com.grupo14.companhia_aerea.dominio.CompanhiaAerea;
import com.grupo14.companhia_aerea.dominio.voo.Assento;
import com.grupo14.companhia_aerea.dominio.voo.Voo;
import com.grupo14.companhia_aerea.repositorio.VooRepository;
import com.grupo14.companhia_aerea.servico.aeroporto.AeroportoDTO;
import com.grupo14.companhia_aerea.servico.companhiaAerea.CompanhiaAereaDTO;
import com.grupo14.companhia_aerea.servico.voo.assento.AssentoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("Duplicates")
@Service
public class VooServiceImpl implements VooService {

    @Autowired
    VooRepository vooRepository;

    public List<VooDTO> listarVoos(){
        List<Voo> voos = vooRepository.findAll();
        List<VooDTO> voosDtos = new ArrayList<>();

        for (Voo voo: voos) {
            VooDTO vooDTO;
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

        return mapearVooParaVooDTO(voo);
    }

//    public List<String> buscarCidadesDeDestino() {
//        List<String> cidadesDeDestino;
//        cidadesDeDestino = vooRepository.buscarCidadesDeDestino();
//
//        return cidadesDeDestino;
//    }
//
//    public List<Voo> buscarVoosPorDestino(String cidadeDestino) {
//        List<Voo> voosRetornados;
//        voosRetornados = vooRepository.buscarVoosPorDestino(cidadeDestino);
//
//        return voosRetornados;
//    }

    private Voo mapearVooDTOParaVoo(VooDTO vooDTO) {
        List<Assento> assentos = vooDTO.getAssentosDTO()
                .stream()
                .map(assento -> new Assento(assento.isOcupado(), assento.getCodigoDoAssento()))
                .collect(Collectors.toList());
        Aeroporto origem = new Aeroporto(vooDTO.getOrigemDTO().getNome(), vooDTO.getOrigemDTO().getCidade(),
                vooDTO.getOrigemDTO().getPais(), vooDTO.getOrigemDTO().getCodigoIATA());
        Aeroporto destino = new Aeroporto(vooDTO.getDestinoDTO().getNome(), vooDTO.getDestinoDTO().getCidade(),
                vooDTO.getDestinoDTO().getPais(), vooDTO.getDestinoDTO().getCodigoIATA());
        CompanhiaAerea companhiaAerea = new CompanhiaAerea(vooDTO.getCompanhiaAereaDTO().getNome(),
                vooDTO.getCompanhiaAereaDTO().getCodigoICAO(), vooDTO.getCompanhiaAereaDTO().getPais());
        Voo voo = new Voo();
        voo.setAssentos(assentos);
        voo.setOrigem(origem);
        voo.setDestino(destino);
        voo.setDataDeIda(vooDTO.getDataDeIda());
        voo.setValorPorAdulto(vooDTO.getValorPorAdulto());
        voo.setValorPorCrianca(vooDTO.getValorPorCrianca());
        voo.setCompanhiaAerea(companhiaAerea);

        return voo;
    }

    private VooDTO mapearVooParaVooDTO(Voo voo) {
        List<AssentoDTO> assentos = voo.getAssentos()
                .stream()
                .map(assento -> new AssentoDTO(assento.isOcupado(), assento.getCodigoDoAssento()))
                .collect(Collectors.toList());
        AeroportoDTO origem = new AeroportoDTO();
        origem.mapearParaDTO(voo.getOrigem());
        AeroportoDTO destino = new AeroportoDTO();
        destino.mapearParaDTO(voo.getDestino());
        CompanhiaAereaDTO companhiaAereaDTO = new CompanhiaAereaDTO();
        companhiaAereaDTO.mapearParaDTO(voo.getCompanhiaAerea());
        VooDTO vooDTO = new VooDTO();
        vooDTO.setAssentosDTO(assentos);
        vooDTO.setOrigemDTO(origem);
        vooDTO.setDestinoDTO(destino);
        vooDTO.setDataDeIda(voo.getDataDeIda());
        vooDTO.setValorPorAdulto(voo.getValorPorAdulto());
        vooDTO.setValorPorCrianca(voo.getValorPorCrianca());
        vooDTO.setCompanhiaAereaDTO(companhiaAereaDTO);

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
