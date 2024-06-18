package com.cibertec.sistema_reserva_juegos.service;

import com.cibertec.sistema_reserva_juegos.entity.Empleado;
import com.cibertec.sistema_reserva_juegos.repository.BaseRepository;
import org.springframework.stereotype.Service;


@Service
public class EmpleadoServiceImpl extends BaseServiceImpl <Empleado, Integer> implements EmpleadoService{

	public EmpleadoServiceImpl(BaseRepository<Empleado, Integer> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}


   
}
