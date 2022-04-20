package Main;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.Test;
import Parking.Parking;
import Parking.ParkingCar;
import Parking.ParkingMotorcycle;
import Parking.ParkingTruck;
import Service.ParkingService;

class MainTest {

	@Test
	void createParkingCar() {
		ParkingCar parkingCar = new ParkingCar("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		assertEquals(parkingCar.getCostTotal(), (Double)5000.0);
	}
	
	@Test
	void saveParkingCar() {
		ParkingService service = new ParkingService();
		ParkingCar parkingCar = new ParkingCar("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		Boolean saveParkingCar = service.save(parkingCar);
		assertEquals(saveParkingCar, true);
	}
	
	@Test
	void listParkingCars() {
		ParkingService service = new ParkingService();
		ParkingCar parkingCar = new ParkingCar("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		Boolean saveParkingCar = service.save(parkingCar);
		ParkingCar parkingCar2 = new ParkingCar("code_002", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		Boolean saveParkingCar2 = service.save(parkingCar2);
		List<Parking> lista = service.listar();
		assertEquals(lista.size(), 2);
	}
	
}
