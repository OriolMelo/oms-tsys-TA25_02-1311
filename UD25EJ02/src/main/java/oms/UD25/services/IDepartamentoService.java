package oms.UD25.services;

import java.util.List;

import oms.UD25.dto.Departamento;

public interface IDepartamentoService {
	//Metodos del CRUD
	public List<Departamento> listarDepartamentos(); //Listar All 
	
	public Departamento guardarDepartamento(Departamento departamento);	//Guarda un video CREATE
	
	public Departamento departamentoXID(int id); //Leer datos de un video READ
	
	public Departamento actualizarDepartamento(Departamento departamento); //Actualiza datos del video UPDATE
	
	public void eliminarDepartamento(int id);// Elimina el video DELETE
}
