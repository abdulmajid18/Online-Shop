package com.rozz.ecom.dto;

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
    private String userName;
    private String firsName;
    private String lastName;
    private String phone;
    private String email;
}
