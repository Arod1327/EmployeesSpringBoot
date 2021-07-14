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

public class JobsController {

	@GetMapping(value="jobs",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Jobs> recuperarJob() {
		return service.recuperarJob();
	}
	@GetMapping(value="jobs/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Jobs recuperarJob(@PathVariable("id") int id) {
		return service.buscarJob(id);
	}
	
	@PostMapping(value="jobs",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String guardarJob(@RequestBody Jobs jobs) {		
		return String.valueOf(service.agregarJob(jobs));
	}
	
	@PutMapping(value="jobs",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizarJob(@RequestBody Jobs jobs) {		
		service.actualizarJob(employee);
	}
		
	@DeleteMapping(value="jobs/{id}")
	public void eliminarPorId(@PathVariable("id") int idJob) {
		service.eliminarJob(idJob);
		
	}
}
