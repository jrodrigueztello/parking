package Service;

import java.util.List;

import Parking.Parking;
import Repository.ParkingRepository;

public class ParkingService {
	private ParkingRepository repository;

	public ParkingService() {
		repository = new ParkingRepository();
	}

	public Boolean save(Parking parkingData) {
		return repository.save(parkingData);
	}

	public List<Parking> listar() {
		return repository.listar();

	}
}
