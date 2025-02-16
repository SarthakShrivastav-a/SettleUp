package com.build.settleup.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "groups")
@Data
public class Group {
    @Id
    private String id;

    private String name;

    @Indexed
    private String createdBy;

    private List<String> members;

    private List<String> expenses;

    private Date createdAt;
    private Date updatedAt;
}
