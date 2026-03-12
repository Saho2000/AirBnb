package AirBnb.example.AirBnb.service;

import AirBnb.example.AirBnb.dto.HotelDto;
import AirBnb.example.AirBnb.dto.HotelSearchRequest;
import AirBnb.example.AirBnb.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);
    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}