package repository;

import exception.parkingLotNotFoundException;
import models.ParkingLot;
import models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkinLotRepository {

    private Map<Integer, ParkingLot>parkingLotMap;

    public ParkinLotRepository() {
        this.parkingLotMap =new HashMap<>();
    }

    public ParkingLot get(int parkingLotId){
        ParkingLot parkingLot=parkingLotMap.get(parkingLotId);

        if(parkingLot==null){
        throw  new parkingLotNotFoundException("ParkingLot not Found for "+parkingLotId);
        }
        return parkingLot;
    }

    public void put(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(),parkingLot);
        System.out.println("Parking lot has been added successfully");
    }



}
