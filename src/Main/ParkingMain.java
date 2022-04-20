package Main;

import java.sql.Timestamp;
import java.util.List;

import Parking.Parking;
import Parking.ParkingCar;
import Parking.ParkingMotorcycle;
import Parking.ParkingTruck;
import Service.ParkingService;

public class ParkingMain {

	public static void main(String args[]) {

		ParkingService service = new ParkingService();

		ParkingCar vehicle1 = new ParkingCar("code_001", Timestamp.valueOf("2018-09-01 09:00:00"),
				Timestamp.valueOf("2018-09-01 11:15:00"));
		service.save(vehicle1);

		ParkingMotorcycle vehicle2 = new ParkingMotorcycle("code_002", Timestamp.valueOf("2018-09-01 09:00:15"),
				Timestamp.valueOf("2018-09-01 10:01:15"));
		service.save(vehicle2);

		ParkingTruck vehicle3 = new ParkingTruck("code_003", Timestamp.valueOf("2018-09-01 12:00:15"),
				Timestamp.valueOf("2018-09-04 12:01:15"), 100);
		service.save(vehicle3);

		// list parkings
		List<Parking> listParkings = service.listar();

		System.out.println("======report parkings======");
		System.out.println("");
		for (Parking parking : listParkings) {
			System.out.println("codigo parqueo: " + parking.getCode());
			System.out.println("tipo vehiculo: " + parking.getVehicle());
			System.out.println("fecha ingreso: " + parking.getStartDate());
			System.out.println("fecha salida: " + parking.getEndDate());
			System.out.println("horas de parqueo: " + parking.getParkingHours());
			System.out.println("costo total: " + parking.getCostTotal());
			System.out.println("");
		}
		System.out.println("======================");
	}

}
