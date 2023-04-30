package com.rozz.ecom.controller;

import com.rozz.ecom.dto.AccountRequest;
import com.rozz.ecom.dto.AccountResponse;
import com.rozz.ecom.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody AccountRequest accountRequest) {
        accountService.createAccount(accountRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AccountResponse> getAllAccounts() {
       return  accountService.getAllAccounts();
    }

}
