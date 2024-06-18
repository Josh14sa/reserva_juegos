package com.cibertec.sistema_reserva_juegos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cibertec.sistema_reserva_juegos.entity.Base;
import com.cibertec.sistema_reserva_juegos.service.BaseServiceImpl;

public class BaseControllerImpl <E extends Base, S extends BaseServiceImpl <E , Integer>>  implements  BaseController <E, Integer>{
	
	@Autowired
	  protected S service;


	  @GetMapping("")
	  public ResponseEntity<?> getAll() {
	    try {

	      return ResponseEntity.status(HttpStatus.OK).body(service.findAll());


	    } catch (Exception e) {

	      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

	    }
	  }

	  @GetMapping("/{id}")
	  public ResponseEntity<?> getOne(@PathVariable Integer id) {
	    try {

	      return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));

	    } catch (Exception e) {

	      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

	    }
	  }

	  @PostMapping("")
	  public ResponseEntity<?> save(E entity) {
	    try {

	      return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));

	    } catch (Exception e) {

	      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

	    }
	  }

	  @PutMapping("/{id}")
	  public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody E entity) {
	    try {


	      return ResponseEntity.status(HttpStatus.OK).body(service.update(id, entity));
	    } catch (Exception e) {

	      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

	    }
	  }

	  @DeleteMapping("/{id}")
	  public ResponseEntity<?> delete(
	   @PathVariable Integer id) {
	    try {


	      return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.delete(id));

	    } catch (Exception e) {

	      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente mas tarde.\"}");

	    }
	  }
	}