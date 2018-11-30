package com.grupo14.companhia_aerea.repositorio;

import com.grupo14.companhia_aerea.dominio.voo.Aeroporto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AeroportoRepository extends JpaRepository<Aeroporto, Long> {
}
