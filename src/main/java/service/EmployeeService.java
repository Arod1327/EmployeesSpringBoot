package service;

import java.util.List;

import model.Employee;

public interface EmployeeService {
	boolean agregarEmpleado(Employee employee);
	List<Employee> recuperarEmpleado();
	void actualizarEmpleado(Employee employee);
	boolean eliminarEmpleado(int idEmpleado);
	Employee recuperarEmpleado(int idEmpleado);
}
