package com.hrm.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name = "EmpId")
	private int empId;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "PhoneNo")
	private String phoneNo;
	
	@Column(name = "EmailId")
	private String emailId;
	
	@Column(name = "DOB")
	private String dob;
	
	@Column(name = "ProfilePic")
	private String pic;
	
	@Column(name = "EmPaasword")
	private String password;
	
	@Column(name = "Role")
	private String role;
	
	@Column(name = "TeamName")
	private String teamName;
	
	@Column(name = "Salary")
	private double salary;
	
	@Column(name = "ManagerId")
	private int managerId;
		
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String name, String address, String gender, String phoneNo, String emailId, String dob,
			String pic, String password, String role, String teamName, double salary, int managerId) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.dob = dob;
		this.pic = pic;
		this.password = password;
		this.role = role;
		this.teamName = teamName;
		this.salary = salary;
		this.managerId = managerId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", phoneNo=" + phoneNo + ", emailId=" + emailId + ", dob=" + dob + ", pic=" + pic + ", password="
				+ password + ", role=" + role + ", teamName=" + teamName + ", salary=" + salary + ", managerId="
				+ managerId + "]";
	}

	

}
