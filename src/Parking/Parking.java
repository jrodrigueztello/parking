package Parking;


import java.sql.Timestamp;

import Parking.Enum.TypeVehicle;

public abstract class Parking {
	private TypeVehicle vehicle;
	private Timestamp startDate;
	private Timestamp endDate;
	private Long totalHours;
	private String code;
	
	//constructor 
	public Parking( String code, TypeVehicle vehicle, Timestamp startDate, Timestamp endDate ) {
		super();
		this.code = code;
		this.vehicle = vehicle;
		this.startDate = startDate; 
		this.endDate = endDate;
		this.totalHours= getCostTotal(startDate, endDate);
		
		
	}
	
	//getters and setters
	
	
	public TypeVehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(TypeVehicle vehicle) {
		this.vehicle = vehicle;
	}	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	

	public Long getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(Long totalHours) {
		this.totalHours = totalHours;
	}
	

	//toStringMethod
	
	@Override
	public String toString() {
		return "Parking [vehicle=" + vehicle + ", startDate=" + startDate + ", endDate=" + endDate + ", code=" + code
				+ "]";
	}
	
	
	//abstracts methods 
	public abstract Long getCostTotal(Timestamp startDate, Timestamp endDate);


	
	
}
