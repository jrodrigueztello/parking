package Util;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class UtilService {
	public ArrayList<Long> obtainHoursBetweenDates(Timestamp startDate, Timestamp endDate) {
		Long difference = endDate.getTime() - startDate.getTime();
		Long hours = TimeUnit.MILLISECONDS.toHours(difference);
		Long minutes = TimeUnit.MILLISECONDS.toMinutes(difference) - hours * 60;
		ArrayList<Long> period = new ArrayList<Long>();
		period.add(hours);
		period.add(minutes);
		return period;

	}

	public ArrayList<Long> obtainDaysBetweenDates(Timestamp startDate, Timestamp endDate) {
		Long difference = endDate.getTime() - startDate.getTime();
		Long days = TimeUnit.MILLISECONDS.toDays(difference);
		Long hours = TimeUnit.MILLISECONDS.toHours(difference) - days * 24;
		ArrayList<Long> period = new ArrayList<Long>();
		period.add(days);
		period.add(hours);
		return period;
	}

	public boolean isBeneficiary(Integer lotteryNumber) {
		Integer randomNumber = (int) (Math.random() * 1000 + 1);
		return randomNumber == lotteryNumber;
	}

	public Long getDaysParking(Timestamp startDate, Timestamp endDate) {
		Long difference = endDate.getTime() - startDate.getTime();
		Long days = TimeUnit.MILLISECONDS.toDays(difference);
		return days;
	}

	
	public Long gethoursParking(Timestamp startDate, Timestamp endDate) {
		Long difference = endDate.getTime() - startDate.getTime();
		Long days = TimeUnit.MILLISECONDS.toDays(difference);
		Long hours = TimeUnit.MILLISECONDS.toHours(difference)- days * 24;;
		return hours;

	}

	
	public Long getMinutesParking(Timestamp startDate, Timestamp endDate) {
		Long difference = endDate.getTime() - startDate.getTime();
		Long days = TimeUnit.MILLISECONDS.toDays(difference);
		Long hours = TimeUnit.MILLISECONDS.toHours(difference) - days * 24;
		Long minutes = TimeUnit.MILLISECONDS.toMinutes(difference)- (hours * 60) - (days * 24*60);
		return minutes;
	}
}
