package service;

import java.util.List;

import model.Jobs;

public interface JobService {

	boolean agregarJob(Jobs jobs);
	List<Jobs> recuperarJob();
	void actualizarJob(Jobs jobs);
	boolean eliminarJob(int idJob);
	Jobs recuperarJob(int idJob);
	
}
