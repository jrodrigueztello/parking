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
	void minimumCostParkingCar() {
		ParkingCar parkingCar = new ParkingCar("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 09:30:00"));
		assertEquals(parkingCar.getCostTotal(), (Double)2000.0);
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
	
	
	/* ************ Motorcycle ****************** */
	
	@Test
	void costParkingMotorcycle() {
		ParkingMotorcycle parkingMotorcycle = new ParkingMotorcycle("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-10-01 11:15:00"));
		assertEquals(parkingMotorcycle.getCostTotal(), (Double)723000.0);
	}
	
	
	@Test
	void minimumCostParkingMotorcycle() {
		ParkingMotorcycle parkingMotorcycle = new ParkingMotorcycle("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 10:00:00"));
		assertEquals(parkingMotorcycle.getCostTotal(), (Double)3000.0);
	}
	
	
	@Test
	void costMoreThanThreeHoursParkingMotorcycle() {
		ParkingMotorcycle parkingMotorcycle = new ParkingMotorcycle("code_001", Timestamp.valueOf("2018-09-01 07:00:00"),
				Timestamp.valueOf("2018-09-01 12:00:00"));
		assertEquals(parkingMotorcycle.getCostTotal(), (Double)5000.0);
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
		Boolean saveparkingMotorcycle = service.save(parkingMotorcycle);
	
		ParkingMotorcycle parkingMotorcycle2 = new ParkingMotorcycle("code_002", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		Boolean saveparkingMotorcycle2 = service.save(parkingMotorcycle2);
		
		ParkingMotorcycle parkingMotorcycle3 = new ParkingMotorcycle("code_003", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		Boolean saveparkingMotorcycle3 = service.save(parkingMotorcycle3);
		
		List<Parking> lista = service.listar();
		assertEquals(lista.size(), 3);
	}
	
	
	@Test
	void startDateParkingMotorcycle() {
		ParkingMotorcycle parkingMotorcycle = new ParkingMotorcycle("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		String dateTime = "2018-09-01 09:00:00";
		Timestamp timestamp = Timestamp.valueOf(dateTime);
		assertEquals(parkingMotorcycle.getStartDate(), timestamp);
	}
	
	@Test
	void endDateParkingMotorcycle() {
		ParkingMotorcycle parkingMotorcycle = new ParkingMotorcycle("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-10-01 11:15:00"));
		String dateTime = "2018-10-01 11:15:00";
		Timestamp timestamp = Timestamp.valueOf(dateTime);
		assertEquals(parkingMotorcycle.getEndDate(), timestamp);
	}
	
	@Test
	void hoursParkingMotorcycle() {
		ParkingMotorcycle parkingMotorcycle = new ParkingMotorcycle("code_001", Timestamp.valueOf("2018-09-01 8:00:00"),
				Timestamp.valueOf("2018-09-01 12:30:00"));
		assertEquals(parkingMotorcycle.getParkingHours(), (Long)4L);
	}
	
	
	@Test
	void typeParkingMotorcycle() {
		ParkingMotorcycle parkingMotorcycle = new ParkingMotorcycle("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-08-01 11:15:00"));
		assertEquals(parkingMotorcycle.getVehicle(), TypeVehicle.MOTO);
	}
	
	
	/* ************ Truck ****************** */
	
	
	
	@Test
	void costParkingTruck() {
		ParkingTruck parkingTruck = new ParkingTruck("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-16 11:15:00"),10);
		assertEquals(parkingTruck.getCostTotal(), (Double)226250.0);
	}
	
	@Test
	void minimumCostParkingTruck() {
		ParkingTruck parkingTruck = new ParkingTruck("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"),10);
		assertEquals(parkingTruck.getCostTotal(), (Double)10000.0);
	}
	
	
	@Test
	void costFullDayParkingTruck() {
		ParkingTruck parkingTruck = new ParkingTruck("code_001", Timestamp.valueOf("2018-09-01 06:00:00"),
				Timestamp.valueOf("2018-09-02 07:00:00"),10);
		assertEquals(parkingTruck.getCostTotal(), (Double)15625.0);
	}
	
	
	@Test
	void saveParkingTruck() {
		ParkingService service = new ParkingService();
		ParkingTruck parkingTruck = new ParkingTruck("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"),15);
		Boolean saveParkingTruck = service.save(parkingTruck);
		assertEquals(saveParkingTruck, true);
	}
	
	
	@Test
	void listParkingTruck() {
		ParkingService service = new ParkingService();
		ParkingTruck parkingTruck = new ParkingTruck("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"),2);
		Boolean saveparkingTruck = service.save(parkingTruck);
	
		ParkingTruck parkingTruck2 = new ParkingTruck("code_002", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"),12);
		Boolean saveparkingTruck2 = service.save(parkingTruck2);
		
		ParkingTruck parkingTruck3 = new ParkingTruck("code_003", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"),36);
		Boolean saveparkingTruck3 = service.save(parkingTruck3);
		
		List<Parking> lista = service.listar();
		assertEquals(lista.size(), 3);
	}
	
	
	@Test
	void startDateParkingTruck() {
		ParkingTruck parkingTruck3 = new ParkingTruck("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"),50);
		String dateTime = "2018-09-01 09:00:00";
		Timestamp timestamp = Timestamp.valueOf(dateTime);
		assertEquals(parkingTruck3.getStartDate(), timestamp);
	}
	
	@Test
	void endDateParkingTruck() {
		ParkingTruck parkingTruck3 = new ParkingTruck("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-10-01 11:15:00"),25);
		String dateTime = "2018-10-01 11:15:00";
		Timestamp timestamp = Timestamp.valueOf(dateTime);
		assertEquals(parkingTruck3.getEndDate(), timestamp);
	}
	
	@Test
	void hoursParkingTruck() {
		ParkingTruck parkingTruck3 = new ParkingTruck("code_001", Timestamp.valueOf("2018-09-01 8:00:00"),
				Timestamp.valueOf("2018-09-01 13:30:00"),26);
		assertEquals(parkingTruck3.getParkingHours(), (Long)5L);
	}
	
	
	@Test
	void typeParkingTruck() {
		ParkingTruck parkingTruck3 = new ParkingTruck("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-08-01 11:15:00"),24);
		assertEquals(parkingTruck3.getVehicle(), TypeVehicle.CAMION);
	}
}
