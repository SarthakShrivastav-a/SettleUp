package com.build.settleup.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "expenses")
public class Expense {
    @Id
    private String id;

    private double amount;
    private String description;

    @Indexed
    private String createdBy; // user idd

    private List<String> participants; // list user ids

    private String splitType; // EQUAL, PERCENTAGE, CUSTOM
    private Date createdAt;
    private Date updatedAt;
}
