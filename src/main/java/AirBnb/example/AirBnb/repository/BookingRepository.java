package AirBnb.example.AirBnb.repository;

import AirBnb.example.AirBnb.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
