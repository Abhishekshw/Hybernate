package com.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "vid")
public class TwoWheeler extends Vehicle {
	private int modelno;
	private String Modelname;
	private boolean abs;
	private int tyretype;
	private String btype;
}
