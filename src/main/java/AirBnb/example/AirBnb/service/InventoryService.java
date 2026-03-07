package AirBnb.example.AirBnb.service;

import AirBnb.example.AirBnb.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}