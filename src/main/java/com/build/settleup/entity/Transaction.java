package com.build.settleup.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;

    private double amount;

    @Indexed
    private String paidBy;

    @Indexed
    private String paidTo;

    private String status;

    private Date createdAt;
    private Date updatedAt;
}
