package AirBnb.example.AirBnb.repository;

import AirBnb.example.AirBnb.entity.Inventory;
import AirBnb.example.AirBnb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByDateAfterAndRoom(LocalDate date, Room room);
}
