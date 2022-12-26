package com.Ex;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Emp_deatils")

public class Emp {
	@Id
	private int empId;
	private String empFristname, emplastName, empmail, empAdd;
	private double empSalary;
	private long empPhone;
	
}
