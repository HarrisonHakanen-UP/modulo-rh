package br.edu.up.jpa.dominio;

import java.sql.Date;
import javax.persistence.*;


@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
    @GeneratedValue   
    private Integer BusinessEntityID;
    
	@Column
	private Integer nationalIDNumber;
	
	@Column
	private Integer loginID;

	@Column
	private String jobTitle;
	
	@Column
	private Date birthDate;
	
	@Column
	private char maritalStatus;
	
	@Column
	private char gender;
	
	@Column
	private Date hireDate;
	
	@Column
	private Integer salariedDate;
	
	@Column
	private Integer vacationHours;
	
	@Column
	private Integer sickLeaveHours;
	
	@Column
	private Integer currentFlag;
	
	@Column
	private Integer rowguid;
	
	@Column
	private Date modifiedDate;

	@OneToOne
    @JoinColumn
	private JobCandidate jobCandidate;
	
	@OneToOne
    @JoinColumn
	private EmployeePayHistory employeePayHistory;
	
	@OneToOne
    @JoinColumn
	private EmployeeDepartmentHistory employeeDepartmentHistory;
		
	protected Employee() {
		
	}
}
