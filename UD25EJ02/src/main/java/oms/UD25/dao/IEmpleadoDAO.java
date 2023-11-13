package oms.UD25.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import oms.UD25.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, String>{
	
}
