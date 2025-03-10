package com.cibertec.sistema_reserva_juegos.entity;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Base implements Serializable{
	
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;

}
