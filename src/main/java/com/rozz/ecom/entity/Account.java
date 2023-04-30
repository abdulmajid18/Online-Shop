package com.rozz.ecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;



@Entity
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false,nullable = false)
    private UUID id;

    @Column(name = "username")
    private String userName;

    @Column(name = "firstname")
    private String firsName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "status")
    private AddressStatus status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToOne(mappedBy = "seller")
    private Product product;
    



}
