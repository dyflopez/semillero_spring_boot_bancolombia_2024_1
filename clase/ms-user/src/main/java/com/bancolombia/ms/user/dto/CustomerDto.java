package com.bancolombia.ms.user.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDto {

    private String name;

    private String lastname;

    private String address;

    private String phoneNumber;

    private String email;

    private LocalDateTime birthdate;

    private String gender;

    private boolean isActive;
}
