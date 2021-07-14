package dao;

import java.util.List;

import model.Employee;


public interface EmployeeDAO {

	void agregarEmpleado(Employee employee);
	
	Employee recuperarEmpleado(String name);
	
	void eliminarEmpleado(String name);
	
	List<Employee> devolverEmpleados();
	
	void eliminarEmpleado(int idEmpleado);
	
	Employee recuperarEmpleado(int idEmpleado);
	
	void actualizarEmpleado(Employee employee);
}
