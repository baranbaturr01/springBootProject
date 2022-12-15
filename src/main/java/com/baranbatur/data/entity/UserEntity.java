package com.baranbatur.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;
    @Column(name = "password", nullable = false)
    @JsonIgnore
    private String password;


    @Column(name = "System_auto_date", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date date;
}
