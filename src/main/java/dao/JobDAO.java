package dao;

import java.util.List;

import model.Jobs;

public interface JobDAO {

	void agregarJob(Jobs jobs);
	
	Jobs recuperarJob(String name);
	
	void eliminarJob(String name);
	
	List<Jobs> devolverJobs();
}
