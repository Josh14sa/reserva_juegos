package com.cibertec.sistema_reserva_juegos.controller;

import com.cibertec.sistema_reserva_juegos.entity.Niños;
import com.cibertec.sistema_reserva_juegos.service.NiñoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/niños")
@CrossOrigin(origins = "http://localhost:4200")
public class NiñosController extends BaseControllerImpl<Niños, NiñoServiceImpl>{

   
}
