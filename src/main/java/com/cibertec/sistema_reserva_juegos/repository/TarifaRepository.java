package com.cibertec.sistema_reserva_juegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.sistema_reserva_juegos.entity.Tarifa;

@Repository
public interface TarifaRepository extends BaseRepository<Tarifa, Integer> {
}
