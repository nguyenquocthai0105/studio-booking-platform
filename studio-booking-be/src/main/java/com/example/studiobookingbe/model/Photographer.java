package com.example.studiobookingbe.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "photographers")
@Data
public class Photographer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private String bio;
    private String location; // Khu vực / địa điểm hoạt động
    private Double rating;
}