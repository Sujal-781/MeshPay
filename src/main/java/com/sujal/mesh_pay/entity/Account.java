package com.sujal.mesh_pay.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    private String vpa;  // Virtual Payment Address, e.g. "alice@demo"

    @Column(nullable = false)
    private String holderName;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal balance;

    @Version  // Optimistic locking — prevents lost updates on concurrent transfers
    private Long version;
}
