package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.JobDAO;
import model.Jobs;

public class JobServiceImpl implements JobService{

	@Autowired
	JobDAO dao;
	@Override
	public boolean agregarJob(Jobs jobs) {
		//añade el empleo si no existe	
		if(dao.recuperarJob(jobs.getidJob())!=null) {
			dao.agregarJob(jobs);
			return true;
		}
		return false;
	}

	@Override
	public List<Job> recuperarJob() {
		return dao.devolverJob();
	}

	@Override
	public void actualizarJob(Jobs jobs) {
		//actualiza el job si existe
		if(dao.recuperarJob(jobs.getidJob())!=null) {
			dao.actualizarJob(jobs);
		}

	}

	@Override
	public boolean eliminarEmpleado(int idEmpleado) {
		if(dao.recuperarEmpleado(idEmpleado)!=null) {
			dao.eliminarEmpleado(idEmpleado);
			return true;
		}
		return false;
	}

	@Override
	public Employee buscarEmpleado(int idEmpleado) {
		return dao.recuperarEmpleado(idEmpleado);
	}
}
