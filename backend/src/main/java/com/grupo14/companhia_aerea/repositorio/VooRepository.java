package com.grupo14.companhia_aerea.repositorio;

import com.grupo14.companhia_aerea.dominio.Comprador;
import com.grupo14.companhia_aerea.dominio.voo.Voo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VooRepository extends JpaRepository<Voo, Long> {
    @Query(value = "SELECT comprador FROM Comprador comprador WHERE comprador.cpf = :cpf")
    Comprador buscarPorCpf(@Param("cpf")String cpf);

    @Query(value = "SELECT DISTINCT cidade_de_destino FROM voo ORDER BY cidade_de_destino", nativeQuery = true)
    List<String> buscarCidadesDeDestino();
}
