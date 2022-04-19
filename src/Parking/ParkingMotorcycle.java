package Parking;

import java.sql.Timestamp;

import Parking.Enum.TypeVehicle;
import Util.UtilService;

public class ParkingMotorcycle extends Parking {
	UtilService utilService = new UtilService();

	public ParkingMotorcycle(String code, TypeVehicle vehicle, Timestamp startDate, Timestamp endDate) {
		super(code, vehicle, startDate, endDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Long getCostTotal(Timestamp startDate, Timestamp endDate) {
		Long hoursBetweenDates = utilService.obtainHoursBetweenDates(startDate, endDate);
		Long costTotal = (long) 2000;
		if (hoursBetweenDates <= 3)
			return (long) 3000;
		Long additionalsHours = hoursBetweenDates - 3;
		return costTotal + Math.round(additionalsHours) * 1000;

	}

}
