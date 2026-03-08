package AirBnb.example.AirBnb.repository;

import AirBnb.example.AirBnb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
