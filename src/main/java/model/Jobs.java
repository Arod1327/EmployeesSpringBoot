package model;

import java.io.Serializable;

import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.Table; 

@Entity
@Table(name="JOBS")
@NamedQuery(name="Job.findAll", query="Select b from Jobs b")
public class Jobs implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@Generatedvalue(strategy=GenerationType.IDENTITY)
	private int idJob;
	
	private int genderId;
	
	private String nameJob;
	
	private int salary;
	
	public Jobs() {
		
	}

	/*Getters*/
	public int getidJob() {
		return this.idJob; 
	}
	
	public String getnameJob() {
		return this.nameJob; 
	}
	
	public int getsalary() {
		return this.salary; 
	}
	
	/*Setters*/
	public void setidJob(int idJob) {
		this.idJob = idJob;
	}
	
	public void setnameJob(String nameJob) {
		this.nameJob = nameJob; 
	}
	
	public void setsalary(int salary) {
		this.salary = salary;
	}
}
