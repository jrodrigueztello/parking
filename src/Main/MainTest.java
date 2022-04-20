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
import Parking.Enum.TypeVehicle;

class MainTest {

	@Test
	void costParkingCar() {
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
	

	@Test
	void startDateParkingCar() {
		ParkingCar parkingCar = new ParkingCar("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		String dateTime = "2018-09-01 09:00:00";
		Timestamp timestamp = Timestamp.valueOf(dateTime);
		assertEquals(parkingCar.getStartDate(), timestamp);
	}
	
	@Test
	void endDateParkingCar() {
		ParkingCar parkingCar = new ParkingCar("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		String dateTime = "2018-09-01 11:15:00";
		Timestamp timestamp = Timestamp.valueOf(dateTime);
		assertEquals(parkingCar.getEndDate(), timestamp);
	}
	
	@Test
	void hoursParkingCar() {
		ParkingCar parkingCar = new ParkingCar("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		assertEquals(parkingCar.getParkingHours(), (Long)2L);
	}
	
	
	@Test
	void typeParkingCar() {
		ParkingCar parkingCar = new ParkingCar("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-08-01 11:15:00"));
		assertEquals(parkingCar.getVehicle(), TypeVehicle.CARRO);
	}
	
	
	@Test
	void parkingMotorcycle() {
		ParkingMotorcycle parkingMotorcycle = new ParkingMotorcycle("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		assertEquals(parkingMotorcycle.getCostTotal(), (Double)3000.0);
	}
	
	@Test
	void saveParkingMotorcycle() {
		ParkingService service = new ParkingService();
		ParkingMotorcycle parkingMotorcycle = new ParkingMotorcycle("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		Boolean saveParkingMotorcycle = service.save(parkingMotorcycle);
		assertEquals(saveParkingMotorcycle, true);
	}
	
	
	@Test
	void listParkingMotorcycle() {
		ParkingService service = new ParkingService();
		ParkingMotorcycle parkingMotorcycle = new ParkingMotorcycle("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		Boolean saveParkingCar = service.save(parkingMotorcycle);
	
		ParkingMotorcycle parkingMotorcycle2 = new ParkingMotorcycle("code_002", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		Boolean saveParkingCar2 = service.save(parkingMotorcycle2);
		
		ParkingMotorcycle parkingMotorcycle3 = new ParkingMotorcycle("code_003", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		Boolean saveParkingCar3 = service.save(parkingMotorcycle3);
		
		List<Parking> lista = service.listar();
		assertEquals(lista.size(), 3);
	}
	
}
