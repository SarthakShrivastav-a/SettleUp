package com.build.settleup.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;
    private String payerId;       // who paid
    private String payeeId;       // who received the money
    private BigDecimal amount;
    private String expenseId;     // links to related expense
    private String groupId;       // optional links to a group
    private String notes;
    private LocalDateTime timestamp = LocalDateTime.now();

    // Constructors, Getters, Setters
}
