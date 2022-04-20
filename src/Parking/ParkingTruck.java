package Parking;

import java.sql.Timestamp;
import java.util.ArrayList;

import Parking.Enum.TypeVehicle;
import Util.UtilService;

public class ParkingTruck extends Parking {
	private Integer lotteryNumber;

	public ParkingTruck(String code, Timestamp startDate, Timestamp endDate, Integer lotteryNumber) {
		super(code, TypeVehicle.CAMION, startDate, endDate);
		this.setLotteryNumber(lotteryNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getCostTotal(Timestamp startDate, Timestamp endDate) {
		UtilService utilService = new UtilService();
		ArrayList<Long> daysBetweenDates = utilService.obtainDaysBetweenDates(startDate, endDate);
		
		if (daysBetweenDates.get(0) < 1 || (daysBetweenDates.get(0) == 1 && daysBetweenDates.get(1) == 0))
			return 10000.0;
		if (utilService.isBeneficiary(this.lotteryNumber))
			return 2000.0;
		Double costTotal = 0.0;
		costTotal += daysBetweenDates.get(0) * 15000;
		costTotal += (daysBetweenDates.get(1) * 15000) / 24;
		return costTotal;
	}

	// getters and setters

	public Integer getLotteryNumber() {
		return lotteryNumber;
	}

	public void setLotteryNumber(Integer lotteryNumber) {
		this.lotteryNumber = lotteryNumber;
	}

}
