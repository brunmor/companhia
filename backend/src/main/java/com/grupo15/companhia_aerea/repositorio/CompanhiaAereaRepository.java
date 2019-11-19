package com.grupo14.companhia_aerea.repositorio;

import com.grupo14.companhia_aerea.dominio.CompanhiaAerea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanhiaAereaRepository extends JpaRepository<CompanhiaAerea, Long> {
}
