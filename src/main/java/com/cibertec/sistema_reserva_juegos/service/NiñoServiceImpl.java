package com.cibertec.sistema_reserva_juegos.service;

import com.cibertec.sistema_reserva_juegos.entity.Niños;
import com.cibertec.sistema_reserva_juegos.repository.BaseRepository;
import org.springframework.stereotype.Service;


@Service
public class NiñoServiceImpl extends BaseServiceImpl <Niños, Integer> implements NiñoService{

	public NiñoServiceImpl(BaseRepository<Niños, Integer> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

	
   
}
