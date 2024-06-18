package com.cibertec.sistema_reserva_juegos.controller;

import com.cibertec.sistema_reserva_juegos.entity.Reservas;
import com.cibertec.sistema_reserva_juegos.service.ReservaServiceImpl;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/reservas")
@CrossOrigin(origins = "http://localhost:4200")
public class ReservaController extends BaseControllerImpl<Reservas, ReservaServiceImpl>{

   
}
