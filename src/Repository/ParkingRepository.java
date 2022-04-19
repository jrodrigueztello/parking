package Repository;

import java.util.ArrayList;
import java.util.List;

import Parking.Parking;

public class ParkingRepository {
	ArrayList<Parking> listparking = new ArrayList<Parking>();

	public Boolean save(Parking parkingData) {
		try {
			listparking.add(parkingData);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public List<Parking> listar() {
		return listparking;
	}

}
