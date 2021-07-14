package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.EmployeeService;
@CrossOrigin(origins = "*") //permite recibir peticiones desde cualquier origen
@RestController

public class EmployeesController {

	@GetMapping(value="empleados",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> recuperarEmpleado() {
		return service.recuperarEmpleado();
	}
	@GetMapping(value="empleados/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee recuperarEmpleado(@PathVariable("id") int id) {
		return service.buscarEmpleado(id);
	}
	
	@PostMapping(value="empleados",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String guardarEmpleado(@RequestBody Employee employee) {		
		return String.valueOf(service.agregarEmpleado(employee));
	}
	
	@PutMapping(value="empleados",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarEmpleado(@RequestBody Employee employee) {		
		service.actualizarEmpleado(employe);
	}
		
	@DeleteMapping(value="empleados/{id}")
	public void eliminarPorId(@PathVariable("id") int idEmpleado) {
		service.eliminarEmpleado(idEmpleado);
		
	}
	
}
