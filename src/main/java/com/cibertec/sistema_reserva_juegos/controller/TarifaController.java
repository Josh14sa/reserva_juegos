package com.cibertec.sistema_reserva_juegos.controller;

import com.cibertec.sistema_reserva_juegos.entity.Tarifa;
import com.cibertec.sistema_reserva_juegos.service.TarifaServiceImpl;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/tarifas")
@CrossOrigin(origins = "http://localhost:4200")
public class TarifaController extends BaseControllerImpl<Tarifa, TarifaServiceImpl> {

  
}
