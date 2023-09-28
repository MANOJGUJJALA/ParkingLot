package repository;

import exception.gateNotFoundException;
import exception.parkingLotNotFoundException;
import models.Gate;
import models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> gateMap;

    public GateRepository() {
        this.gateMap =new HashMap<>();
    }

    public Gate get(int gateId){
        Gate gate=gateMap.get(gateId);

        if(gate==null){
            throw  new gateNotFoundException("Gate not Found for "+gateId);
        }
        return gate;
    }

    public void put(Gate gate){
        gateMap.put(gate.getId(),gate);
        System.out.println("Gate has been added successfully");
    }
}
