package AirBnb.example.AirBnb.dto;

import AirBnb.example.AirBnb.entity.User;
import AirBnb.example.AirBnb.entity.enumm.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}