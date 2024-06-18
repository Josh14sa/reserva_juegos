package com.cibertec.sistema_reserva_juegos.repository;

import org.springframework.stereotype.Repository;
import com.cibertec.sistema_reserva_juegos.entity.Clientes;


@Repository
public interface ClienteRepository  extends BaseRepository<Clientes, Integer> {
//    @Query("select c from Clientes c where c.apellido like ?1")
//    public List<Clientes> listApellidoCliente(String ape);

}
