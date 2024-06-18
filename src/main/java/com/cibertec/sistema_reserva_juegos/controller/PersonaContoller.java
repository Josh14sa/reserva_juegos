package com.cibertec.sistema_reserva_juegos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cibertec.sistema_reserva_juegos.entity.Persona;
import com.cibertec.sistema_reserva_juegos.service.PersonaServiceImpl;


@RestController
@RequestMapping("/api/v1/personas")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaContoller extends BaseControllerImpl<Persona, PersonaServiceImpl>{

}
