package com.cibertec.sistema_reserva_juegos.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tarifa")
public class Tarifa extends Base{

    

    @Column(name = "dia_semana")
    private String diaSemana;

    @Column(name = "duracion")
    private Integer duracion;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "tipo_entrada")
    private String tipoEntrada;
}
