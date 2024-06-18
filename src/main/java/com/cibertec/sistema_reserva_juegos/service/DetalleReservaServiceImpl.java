package com.cibertec.sistema_reserva_juegos.service;

import org.springframework.stereotype.Service;

import com.cibertec.sistema_reserva_juegos.entity.DetalleReserva;
import com.cibertec.sistema_reserva_juegos.entity.Empleado;
import com.cibertec.sistema_reserva_juegos.repository.BaseRepository;
import com.cibertec.sistema_reserva_juegos.repository.DetalleReservaRepository;

@Service
public class DetalleReservaServiceImpl extends BaseServiceImpl <DetalleReserva, Integer> implements DetalleReservaService{

	public DetalleReservaServiceImpl(BaseRepository<DetalleReserva, Integer> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

	


}
