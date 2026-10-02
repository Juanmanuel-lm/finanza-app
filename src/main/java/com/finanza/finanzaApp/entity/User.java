package com.finanza.finanzaApp.entity;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
@Table(name="users") 
@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@ToString 
public class User {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Instant createdAt;

    @ToString.Exclude
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Category> categories = new ArrayList<>();

    @ToString.Exclude
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<Transaction> transaction = new ArrayList<>();
    
    @ToString.Exclude
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY) 
    private List<Budget> budget = new ArrayList<>();
}
