package com.cibertec.sistema_reserva_juegos.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "detalle_reserva")
public class DetalleReserva extends Base{

   
    @ManyToOne
    @JoinColumn(name = "reserva_id", nullable = false)
    private Reservas reserva;

    @ManyToOne
    @JoinColumn(name = "tarifa_id", nullable = false)
    private Tarifa tarifa;
}
