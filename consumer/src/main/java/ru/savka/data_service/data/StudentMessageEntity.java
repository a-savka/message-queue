package ru.savka.data_service.data;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Data
@Entity
@Table(name = "student_message", schema = "utmn")
public class StudentMessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "passport")
    private String passport;

    @Column(name = "created_at")
    private Instant createdAt;
}