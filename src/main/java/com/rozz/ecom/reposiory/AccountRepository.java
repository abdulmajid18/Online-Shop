package com.rozz.ecom.reposiory;

import com.rozz.ecom.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AccountRepository  extends CrudRepository<Account, UUID> {
}
