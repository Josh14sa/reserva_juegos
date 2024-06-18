package com.cibertec.sistema_reserva_juegos.controller;

import com.cibertec.sistema_reserva_juegos.entity.Clientes;
import com.cibertec.sistema_reserva_juegos.service.ClienteServiceImpl;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController extends BaseControllerImpl<Clientes, ClienteServiceImpl>{

   
    
}
