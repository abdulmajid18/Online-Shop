package com.rozz.ecom.dto;

import com.rozz.ecom.entity.AccountStatus;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse {
    private UUID id;
    private String username;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private AccountStatus status;
}
