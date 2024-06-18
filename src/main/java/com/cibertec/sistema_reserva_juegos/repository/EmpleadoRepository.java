package com.cibertec.sistema_reserva_juegos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cibertec.sistema_reserva_juegos.entity.Clientes;
import com.cibertec.sistema_reserva_juegos.entity.Empleado;

import java.util.List;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado, Integer> {

//    @Query("select c from Empleado c where c.apellido like ?1")
//    public List<Empleado> listApellidoEmpleado(String ape);
}
