package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Employee;

@Repository

public class EmployeeDaoImpl {

	@Autowired
	EmployeeJpaSpring employee;


	@Override
	public void agregarEmpleado(Employee employee) {
		employee.save(employee);
	}

	@Override
	public Employee recuperarEmpleado(String name) {
		return employee.findByName(name);
	}

	@Override
	public void eliminarEmpleado(String name) {
		employee.eliminarPorNombre(name);
	}

	@Override
	public List<Employee> devolverEmpleados() {
		return employee.findAll();
	}
	
	@Override
	public void eliminarEmpleado(int idEmpleado) {
		employee.deleteById(idEmpleado);		
	}

	@Override
	public Employee recuperarEmpleado(int idEmpleado) {	
		return employee.findById(idEmpleado).orElse(null);
	}

	@Override
	public void actualizarEmpleado(Employee employee) {
		employee.save(employee);
		
	}
	
}
