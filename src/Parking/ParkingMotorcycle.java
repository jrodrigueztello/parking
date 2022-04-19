package Parking;

import java.sql.Timestamp;
import java.util.ArrayList;

import Parking.Enum.TypeVehicle;
import Util.UtilService;

public class ParkingMotorcycle extends Parking {

	public ParkingMotorcycle(String code, Timestamp startDate, Timestamp endDate) {
		super(code, TypeVehicle.MOTO, startDate, endDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getCostTotal(Timestamp startDate, Timestamp endDate) {
		UtilService utilService = new UtilService();
		ArrayList<Long> hoursBetweenDates = utilService.obtainHoursBetweenDates(startDate, endDate);
		Double costTotal = 3000.0;
		if (hoursBetweenDates.get(0) < 3 || (hoursBetweenDates.get(0) == 3 && hoursBetweenDates.get(1) == 0))
			return costTotal;
		Double additionalsHours = (double) (hoursBetweenDates.get(0) - 3);
		costTotal += Math.round(additionalsHours) * 1000;
		if (hoursBetweenDates.get(1) > 0)
			costTotal += 1000;
		return costTotal;
	}

}
