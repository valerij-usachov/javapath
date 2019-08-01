package com.vusachov.urlshortener.repositorues;

import com.vusachov.urlshortener.domain.AccountType;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccountTypeRepository extends CrudRepository<AccountType, String> {

    Optional<AccountType> findByUrlExpPeriod(int urlExpPeriod);
}
