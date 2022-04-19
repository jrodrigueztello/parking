package Parking;

import java.sql.Timestamp;

import Parking.Enum.TypeVehicle;
import Util.UtilService;

public abstract class Parking {
	private TypeVehicle vehicle;
	private Timestamp startDate;
	private Timestamp endDate;
	private Double costTotal;
	private String code;
	private Long parkingHours;

	// constructor
	public Parking(String code, TypeVehicle vehicle, Timestamp startDate, Timestamp endDate) {
		super();
		this.code = code;
		this.vehicle = vehicle;
		this.startDate = startDate;
		this.endDate = endDate;
		this.costTotal = getCostTotal(startDate, endDate);
		this.parkingHours = getParkingHours(startDate, endDate);

	}

	// getters and setters

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

	public Double getCostTotal() {
		return costTotal;
	}

	public void setCostTotal(Double costTotal) {
		this.costTotal = costTotal;
	}

	public Long getParkingHours() {
		return parkingHours;
	}

	public void setParkingHours(Long parkingHours) {
		this.parkingHours = parkingHours;
	}

	// toStringMethod

	@Override
	public String toString() {
		return "Parking [vehicle=" + vehicle + ", startDate=" + startDate + ", endDate=" + endDate + ", code=" + code
				+ "]";
	}

	// abstracts methods
	public abstract Double getCostTotal(Timestamp startDate, Timestamp endDate);

	public Long getParkingHours(Timestamp startDate, Timestamp endDate) {
		UtilService utilService = new UtilService();
		return utilService.gethoursParking(startDate, endDate);
	}

}
