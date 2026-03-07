package AirBnb.example.AirBnb.repository;

import AirBnb.example.AirBnb.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
