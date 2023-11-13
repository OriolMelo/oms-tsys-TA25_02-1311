package oms.UD25.services;

import java.util.List;

import oms.UD25.dto.Empleado;

public interface IEmpleadoService {
	//Metodos del CRUD
		public List<Empleado> listarEmpleados(); //Listar All 
		
		public Empleado guardarEmpleado(Empleado empleado);	//Guarda un video CREATE
		
		public Empleado empleadoXID(String dni); //Leer datos de un video READ
		
		public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del video UPDATE
		
		public void eliminarEmpleado(String dni);// Elimina el video DELETE
}
