package com.hrm.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Leaves")
public class Leaves {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "EmpId")
	private int empId;
	
	@Column(name = "LeaveType")
	private String leaveType;
	
	@Column(name = "StartDate")
	private String startDate;
	
	@Column(name = "EndDate")
	private String endDate;

	@Column(name = "Comment")
	private String comment;
	
	@Column(name = "NoOfDays")
	private int noOfDays;

	@Column(name = "ApprovalStatus")
	private String approvalStatus;

	@Column(name = "ApprovalRemarks")
	private String approvalRemarks;
	

	public Leaves() {
		// TODO Auto-generated constructor stub
	}

	public Leaves(int empId, String leaveType, String startDate, String endDate, String comment, int noOfDays, String approvalStatus, String approvalRemarks) {
		super();
		this.empId = empId;
		this.leaveType = leaveType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.comment = comment;
		this.noOfDays = noOfDays;
		this.approvalStatus = approvalStatus;
		this.approvalRemarks = approvalRemarks;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getApprovalRemarks() {
		return approvalRemarks;
	}

	public void setApprovalRemarks(String approvalRemarks) {
		this.approvalRemarks = approvalRemarks;
	}

	@Override
	public String toString() {
		return "Leaves [id=" + id + ", empId=" + empId + ", leaveType=" + leaveType + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", comment=" + comment + ", noOfDays=" + noOfDays + ", approvalStatus="
				+ approvalStatus + ", approvalRemarks=" + approvalRemarks + "]";
	}
	
	

}
