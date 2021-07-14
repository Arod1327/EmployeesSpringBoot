package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Employee;
import model.Jobs;

@Repository

public class JobDaoImpl {

	@Autowired
	JobjpaSpring job;
	
	@Override
	public void agregarJob(Jobs jobs) {
		job.save(jobs);
	}

	@Override
	public Jobs recuperarJob(String name) {
		return job.findByName(name);
	}

	@Override
	public void eliminarJob(String name) {
		job.eliminarPorNombre(name);
	}

	@Override
	public List<Jobs> devolverJobs() {
		return job.findAll();
	}
}
