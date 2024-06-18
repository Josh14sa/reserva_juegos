package com.cibertec.sistema_reserva_juegos.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persona")
public class Persona extends Base{

   
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "dni", length = 15)
    private String dni;

    @Column(name = "fecha_nac", nullable = false)
    private Date fechaNacimiento;

    @Column(name = "telefono", length = 20, nullable = false)
    private String telefono;
}
