package com.hrm.employee.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date dob;
	
	/*@Lob
	@Column(name = "ProfilePic")
	private byte[] pic;*/
	
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
	
	public Employee(int empId, String name, String address, String gender, String phoneNo, String emailId, Date dob,
			String password, String role, String teamName, double salary, int managerId) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.dob = dob;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/*public byte[] getPic() {
		return pic;
	}
	public void setPic(byte[] pic) {
		this.pic = pic;
	}*/
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
				+ ", phoneNo=" + phoneNo + ", emailId=" + emailId + ", dob=" + dob + ", password="
				+ password + ", role=" + role + ", teamName=" + teamName + ", salary=" + salary + ", managerId="
				+ managerId + "]";
	}

	

}
