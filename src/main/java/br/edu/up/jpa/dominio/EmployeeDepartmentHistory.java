package br.edu.up.jpa.dominio;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeDepartamentHistory")
public class EmployeeDepartmentHistory {

	@Id
	private Integer businessEntityID;

	@Column
	private Date startDate;

	@Column
	private Date endDate;

	@Column
	private Date modifiedDate;

	@ManyToOne
	@JoinColumn
	private Department department;

	@ManyToOne
	@JoinColumn
	private Employee employee;

	@ManyToOne
	@JoinColumn
	private Shift shift;


	public EmployeeDepartmentHistory(Integer businessEntityID, Date startDate, Date endDate, Date modifiedDate,
			Department department, Employee employee, Shift shift) {
		super();
		this.businessEntityID = businessEntityID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.modifiedDate = modifiedDate;
		this.department = department;
		this.employee = employee;
		this.shift = shift;
	}

	protected EmployeeDepartmentHistory() {

	}

	public Integer getBusinessEntityID() {
		return businessEntityID;
	}

	public void setBusinessEntityID(Integer businessEntityID) {
		this.businessEntityID = businessEntityID;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}
	
	
}
