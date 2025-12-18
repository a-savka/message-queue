package ru.savka.data_service.dto;

import lombok.Data;
import java.time.Instant;

@Data
public class StudentMessage {
    private String fullName;
    private String passport;
    private Instant createdAt;
}