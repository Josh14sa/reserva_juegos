package com.cibertec.sistema_reserva_juegos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.sistema_reserva_juegos.entity.DetalleReserva;
import com.cibertec.sistema_reserva_juegos.entity.Empleado;
import com.cibertec.sistema_reserva_juegos.service.DetalleReservaServiceImpl;
import com.cibertec.sistema_reserva_juegos.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api/v1/detalles")
@CrossOrigin(origins = "http://localhost:4200")
public class DetalleReservaController extends BaseControllerImpl<DetalleReserva, DetalleReservaServiceImpl>{

}
