package com.bancolombia.ms.user.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String lastname;

    private String address;

    @Column(name = "phonenumber")
    private String phoneNumber;

    private String email;

    private LocalDateTime birthdate;

    private String gender;

    @Column(name = "is_active")
    private boolean isActive;

}
