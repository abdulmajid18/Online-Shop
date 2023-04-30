package com.rozz.ecom.service;

import com.rozz.ecom.dto.AccountRequest;
import com.rozz.ecom.entity.Account;
import com.rozz.ecom.reposiory.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountService {

    private final AccountRepository accountRepository;
    public void createAccount(AccountRequest accountRequest) {
        Account account = Account.builder()
                .userName(accountRequest.getUserName())
                .firsName(accountRequest.getFirsName())
                .lastName(accountRequest.getLastName())
                .email(accountRequest.getEmail())
                .phone(accountRequest.getPhone())
                .password(accountRequest.getPassword()).build();
        accountRepository.save(account);
        log.info("Account {} created and saved!", account.getUserName());

    }
}
