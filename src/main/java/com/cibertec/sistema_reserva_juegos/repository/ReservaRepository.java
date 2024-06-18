package com.cibertec.sistema_reserva_juegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.sistema_reserva_juegos.entity.Reservas;

@Repository
public interface ReservaRepository extends BaseRepository<Reservas, Integer> {
}
