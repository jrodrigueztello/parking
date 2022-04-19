package Parking;

import java.sql.Timestamp;
import java.util.ArrayList;

import Parking.Enum.TypeVehicle;
import Util.UtilService;

public class ParkingCar extends Parking {

	public ParkingCar(String code, Timestamp startDate, Timestamp endDate) {
		super(code, TypeVehicle.CARRO, startDate, endDate);
	}

	@Override
	public Double getCostTotal(Timestamp startDate, Timestamp endDate) {
		UtilService utilService = new UtilService();
		ArrayList<Long> hoursBetweenDates = utilService.obtainHoursBetweenDates(startDate, endDate);
		Double costTotal = 0.0;
		if (hoursBetweenDates.get(0) < 1 || hoursBetweenDates.get(0) == 1 && hoursBetweenDates.get(1) == 0)
			return 2000.0;
		costTotal = hoursBetweenDates.get(0) * 2000.0;
		if (hoursBetweenDates.get(1) > 0)
			costTotal += 1000;
		return costTotal;

	}

}
