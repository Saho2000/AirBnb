package AirBnb.example.AirBnb.service;

import AirBnb.example.AirBnb.dto.BookingDto;
import AirBnb.example.AirBnb.dto.BookingRequest;
import AirBnb.example.AirBnb.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
