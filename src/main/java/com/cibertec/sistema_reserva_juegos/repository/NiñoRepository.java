package com.cibertec.sistema_reserva_juegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.sistema_reserva_juegos.entity.Niños;

@Repository
public interface NiñoRepository extends BaseRepository<Niños,Integer> {
}
