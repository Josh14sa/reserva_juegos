package com.cibertec.sistema_reserva_juegos.service;

import com.cibertec.sistema_reserva_juegos.entity.Persona;
import com.cibertec.sistema_reserva_juegos.repository.BaseRepository;
import org.springframework.stereotype.Service;


@Service
public class PersonaServiceImpl extends BaseServiceImpl <Persona, Integer> implements PersonaService{

	public PersonaServiceImpl(BaseRepository<Persona, Integer> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

	

}
