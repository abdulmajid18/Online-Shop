package com.rozz.ecom.dto;

import com.rozz.ecom.entity.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// DTO  data transfer objects
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequest {
    private String username;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String password;

    public AccountStatus getDefaultStatus() {
        return AccountStatus.UNKNOWN;
    }
}
