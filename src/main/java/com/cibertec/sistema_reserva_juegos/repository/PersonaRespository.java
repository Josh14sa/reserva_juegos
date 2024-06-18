package com.cibertec.sistema_reserva_juegos.repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.sistema_reserva_juegos.entity.Persona;

@Repository
public interface PersonaRespository extends BaseRepository<Persona, Integer> {
}
