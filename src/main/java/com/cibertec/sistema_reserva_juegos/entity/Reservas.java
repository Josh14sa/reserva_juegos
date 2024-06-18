package com.cibertec.sistema_reserva_juegos.entity;

import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reserva")
public class Reservas extends Base {

   

    @Column(name = "cantidad_adultos", nullable = false)
    private Integer cantidadAdultos;

    @Column(name = "cantidad_ninos", nullable = false)
    private Integer cantidadNinos;

    @Column(name = "duracion_reserva", nullable = false)
    private Time duracionReserva;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "hora_fin", nullable = false)
    private Time horaFin;

    @Column(name = "hora_inicio", nullable = false)
    private Time horaInicio;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Clientes cliente;

    @ManyToOne
    @JoinColumn(name = "empleado_id", nullable = false)
    private Empleado empleado;

    @ManyToMany
    @JoinTable(
            name = "detalle_reserva",
            joinColumns = @JoinColumn(name = "reserva_id"),
            inverseJoinColumns = @JoinColumn(name = "tarifa_id")
    )
    private List<Tarifa> tarifas;
}
