package com.spring.beans;

public class Employee {

	private int empId;
	private String empName;
	private String dept;
	private Double salary;

	public Employee(int empId, String empName, String dept, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}
	
	public Employee(int empId, String empName, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getempName() {
		return empName;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + ", salary=" + salary + "]";
	}

}
