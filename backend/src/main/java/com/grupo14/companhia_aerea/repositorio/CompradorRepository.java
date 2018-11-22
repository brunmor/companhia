package com.grupo14.companhia_aerea.repositorio;

import com.grupo14.companhia_aerea.dominio.Comprador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompradorRepository extends JpaRepository<Comprador, Long> {
}
