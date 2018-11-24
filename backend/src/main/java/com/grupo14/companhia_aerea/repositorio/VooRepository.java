package com.grupo14.companhia_aerea.repositorio;

import com.grupo14.companhia_aerea.dominio.voo.Voo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VooRepository extends JpaRepository<Voo, Long> {
}
