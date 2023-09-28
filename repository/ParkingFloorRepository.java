package repository;

import exception.parkingFloorNotFoundException;
import exception.parkingLotNotFoundException;
import models.ParkingFloor;
import models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository() {
        this.parkingFloorMap =new HashMap<>();
    }

    public ParkingFloor get(int parkingFloorId){
        ParkingFloor parkingFloor=parkingFloorMap.get(parkingFloorId);

        if(parkingFloor==null){
            throw  new parkingFloorNotFoundException("ParkingFloor not Found for "+parkingFloorId);
        }
        return parkingFloor;
    }

    public void put(ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getId(),parkingFloor);
        System.out.println("Parking floor has been added successfully");
    }
}
