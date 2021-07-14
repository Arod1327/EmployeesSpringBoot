package model;

import java.io.Serializable; 
import javax.persistence.*;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.Table;

@Entity
@Table(name="EMPLOYEES")
@NamedQuery(name="Employee.findAll", query="Select c from Employee c")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Generatedvalue(strategy=GenerationType.IDENTITY)
	private int idEmployee;
	
	private int genderId;
	
	private int jobId;
	
	private String nameEmployee;
	
	private String lastnameEmployee;
	
	private String birthdateEmployee;

	public Employee() {
		
	}
	
	/*Getters*/
	public int getidEmployee() {
		return this.idEmployee; 
	}
	public int getgenderId() {
		return this.genderId; 
	}
	public int getjobId() {
		return this.jobId; 
	}
	public String getnameEmployee() {
		return this.nameEmployee; 
	}
	public String getlastnameEmployee() {
		return this.lastnameEmployee; 
	}
	
	public String getbirthdateEmployee() {
		return this.birthdateEmployee; 
	}
	
	/*Setters*/
	public void setidEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public void setgenderId(int genderId) {
		this.genderId = genderId;
	}
	public void setjobId(int jobId) {
		this.jobId = jobId;
	}
	public void setnameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee; 
	}
	public void setlastnameEmployee(String lastnameEmployee) {
		this.lastnameEmployee = lastnameEmployee; 
	}
	public void setbirthdateEmployee(String birthdateEmployee) {
		this.birthdateEmployee = birthdateEmployee; 
	}
}
