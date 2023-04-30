package com.rozz.ecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name="address")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;
    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "country")
    private String country;

    @OneToOne(mappedBy = "address")
    private Account account;


}
