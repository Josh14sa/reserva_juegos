package com.cibertec.sistema_reserva_juegos.controller;

import com.cibertec.sistema_reserva_juegos.entity.Empleado;
import com.cibertec.sistema_reserva_juegos.service.EmpleadoServiceImpl;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/empleados")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoController extends BaseControllerImpl<Empleado, EmpleadoServiceImpl>{

   
}
