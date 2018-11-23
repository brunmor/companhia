package com.grupo14.companhia_aerea.repositorio;

import com.grupo14.companhia_aerea.dominio.Comprador;
import com.grupo14.companhia_aerea.servico.CompradorDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompradorRepository extends JpaRepository<Comprador, Long> {

    @Query(value = "SELECT comprador FROM Comprador comprador WHERE comprador.cpf = :cpf")
    Comprador buscarPorCpf(@Param("cpf")String cpf);
}
