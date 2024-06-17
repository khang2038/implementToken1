package com.example.implementtoken1.Shared.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String createdBy;
    private String updatedBy;

    @CreationTimestamp
    @Column(name = "created_at",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date updatedAt;
}
