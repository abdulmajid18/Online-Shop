package com.rozz.ecom.dto;

import com.rozz.ecom.entity.Address;
import com.rozz.ecom.entity.AddressStatus;
import com.rozz.ecom.entity.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
// DTO  data transfer objects
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequest {
    private String userName;
    private String firsName;
    private String lastName;
    private String phone;
    private String email;
    private String password;
}
