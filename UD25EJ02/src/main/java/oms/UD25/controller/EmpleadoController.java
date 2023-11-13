package oms.UD25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oms.UD25.dto.Empleado;
import oms.UD25.services.EmpleadoServiceImpl;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/all")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	
	@PostMapping("/add")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {
		
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	
	@GetMapping("/{dni}")
	public Empleado empleadoXID(@PathVariable(name="dni") String id) {
		
		Empleado empleado_xid= new Empleado();
		
		empleado_xid=empleadoServiceImpl.empleadoXID(id);
		
		System.out.println("Empleado XID: "+empleado_xid);
		
		return empleado_xid;
	}
	
	@PutMapping("/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name="dni")String id,@RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		
		empleado_seleccionado= empleadoServiceImpl.empleadoXID(id);

		empleado_seleccionado.setDni(empleado.getDni());
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
		
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/{dni}")
	public void eliminarEmpleado(@PathVariable(name="dni")String id) {
		empleadoServiceImpl.eliminarEmpleado(id);
		System.out.println("Empleado eliminado");
	}
}
