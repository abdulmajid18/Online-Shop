package com.rozz.ecom.service;

import com.rozz.ecom.dto.AccountRequest;
import com.rozz.ecom.dto.AccountResponse;
import com.rozz.ecom.entity.Account;
import com.rozz.ecom.reposiory.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountService {

    private final AccountRepository accountRepository;
    public void createAccount(AccountRequest accountRequest) {
        Account account = Account.builder()
                .userName(accountRequest.getUsername())
                .firsName(accountRequest.getFirstname())
                .lastName(accountRequest.getLastname())
                .email(accountRequest.getEmail())
                .phone(accountRequest.getPhone())
                .password(accountRequest.getPassword())
                .status(accountRequest.getDefaultStatus()).build();
        accountRepository.save(account);
        log.info("Account {} created and saved!", account.getUserName());
    }

    public List<AccountResponse> getAllAccounts() {
        List<Account>  accounts = (List<Account>) accountRepository.findAll();
        return accounts.stream().map(this::mapToAccountResponse).toList();
    }

    private AccountResponse mapToAccountResponse(Account account) {
        return AccountResponse.builder()
                .id(account.getId())
                .username(account.getUserName())
                .firstname(account.getFirsName())
                .lastname(account.getLastName())
                .phone(account.getPhone())
                .email(account.getEmail()).build();
    }
}
