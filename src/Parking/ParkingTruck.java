package Parking;


import java.sql.Timestamp;

import Parking.Enum.TypeVehicle;

public class ParkingTruck extends Parking {

	public ParkingTruck(String code, TypeVehicle vehicle, Timestamp startDate, Timestamp endDate) {
		super(code, vehicle, startDate, endDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Long getCostTotal(Timestamp startDate, Timestamp endDate) {
		// TODO Auto-generated method stub
		return null;
	}


}
