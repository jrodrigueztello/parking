package Main;

import java.sql.Timestamp;
import java.util.List;

import Parking.Parking;
import Parking.ParkingCar;
import Service.ParkingService;

public class ParkingMain {

	public static void main(String args[]) {
		ParkingService service = new ParkingService();
		ParkingCar vehicle1 = new ParkingCar("code_001", Timestamp.valueOf("2018-09-01 09:00:15"), Timestamp.valueOf("2018-09-01 12:01:15"));
		service.save(vehicle1);
		
		
		//list parkings
		List<Parking> listParkings = service.listar();

	}

}
