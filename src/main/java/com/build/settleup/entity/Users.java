package com.build.settleup.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;
import java.util.Date;
import java.util.List;

@Document(collection = "users")
@Data
public class Users {
    @Id
    private String id;

    @Indexed(unique = true)
    private String email;
    private String name;
    private String password;
    private Date createdAt;
    private Date updatedAt;
    private String upiId;
}
