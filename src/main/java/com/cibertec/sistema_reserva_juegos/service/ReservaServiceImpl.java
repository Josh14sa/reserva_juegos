package com.cibertec.sistema_reserva_juegos.service;

import com.cibertec.sistema_reserva_juegos.entity.Reservas;
import com.cibertec.sistema_reserva_juegos.repository.BaseRepository;
import org.springframework.stereotype.Service;


@Service
public class ReservaServiceImpl extends BaseServiceImpl <Reservas, Integer> implements ReservaService{

	public ReservaServiceImpl(BaseRepository<Reservas, Integer> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

	

   
}
