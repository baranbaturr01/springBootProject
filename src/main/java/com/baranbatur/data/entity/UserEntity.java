package com.baranbatur.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    @JsonIgnore
    private String password;

    @Column(name = "System_auto_date", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date date;

}
