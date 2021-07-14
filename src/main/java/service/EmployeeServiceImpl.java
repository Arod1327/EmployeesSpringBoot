package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EmployeeDAO;
import model.Employee;

@Service

public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDAO dao;
	@Override
	public boolean agregarEmpleado(Employee employee) {
		//añade el empleado si no existe	
		if(dao.recuperarEmpleado(employee.getidEmployee())!=null) {
			//Falta la validación del job para insertar y si es mayor a 18 años
			dao.agregarEmpleado(employee);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> recuperarEmpleado() {
		return dao.devolverEmpleados();
	}

	@Override
	public void actualizarEmpleado(Employee employee) {
		//actualiza el empleado si existe
		if(dao.recuperarEmpleado(employee.getidEmployee())!=null) {
			dao.actualizarEmpleado(employee);
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
