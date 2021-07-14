package dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Employee;

public interface EmployeeJpaSpring extends JpaRepository<Employee, Integer>{
	Employee findByName(String name);
	@Transactional
	@Modifying
	@Query("Delete from Employee c Where c.name=?1")
	void eliminarEmpleado(String name);
}
