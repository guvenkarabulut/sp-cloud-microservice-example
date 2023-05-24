package com.springcloudmicroserviceexample.accountservice.entity;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@Table(value="accounts")
public class Account implements Serializable {
    @PrimaryKey
    public String id= UUID.randomUUID().toString();

    @Setter
    @Column(value = "uname")
    public String username;
    @Setter
    @Column(value = "email")
    public String email;
    @Setter
    @Column(value = "pwd")
    public String passwd;
    @Column(value = "created_at")
    private Date createdAt;
    @Column(value = "is_active")
    private Boolean isActive;
}
