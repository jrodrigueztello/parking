package Util;

import java.sql.Timestamp;

public class UtilService {
	public Long obtainHoursBetweenDates(Timestamp startDate, Timestamp endDate) {
		Long difference = (endDate.getTime()-startDate.getTime()); 
		return difference / (60 * 60 * 1000);
		
		
	}
}
