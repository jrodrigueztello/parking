package Parking;

import java.sql.Timestamp;

import Parking.Enum.TypeVehicle;
import Util.UtilService;

public class ParkingCar extends Parking {
	UtilService utilService = new UtilService();

	public ParkingCar(String code, Timestamp startDate, Timestamp endDate) {
		super(code, TypeVehicle.CARRO, startDate, endDate);
	}

	@Override
	public Long getCostTotal(Timestamp startDate, Timestamp endDate) {
		Long hoursBetweenDates = utilService.obtainHoursBetweenDates(startDate, endDate);
		if (hoursBetweenDates < 1)
			return (long) 1000;
		return hoursBetweenDates * 2000;
 
	}

}
