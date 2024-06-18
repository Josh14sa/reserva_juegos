package com.cibertec.sistema_reserva_juegos.service;

import com.cibertec.sistema_reserva_juegos.entity.Tarifa;
import com.cibertec.sistema_reserva_juegos.repository.BaseRepository;
import org.springframework.stereotype.Service;


@Service
public class TarifaServiceImpl extends BaseServiceImpl <Tarifa, Integer> implements TarifasService{

	public TarifaServiceImpl(BaseRepository<Tarifa, Integer> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}


}
