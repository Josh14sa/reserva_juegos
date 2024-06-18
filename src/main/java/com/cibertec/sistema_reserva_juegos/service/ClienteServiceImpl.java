package com.cibertec.sistema_reserva_juegos.service;

import com.cibertec.sistema_reserva_juegos.entity.Clientes;
import com.cibertec.sistema_reserva_juegos.repository.BaseRepository;

import org.springframework.stereotype.Service;


@Service
public class ClienteServiceImpl extends BaseServiceImpl <Clientes, Integer> implements ClienteService{

	public ClienteServiceImpl(BaseRepository<Clientes, Integer> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

	

}
