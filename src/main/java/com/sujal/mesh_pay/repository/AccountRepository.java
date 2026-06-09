package com.sujal.mesh_pay.repository;

import com.sujal.mesh_pay.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
