package ru.savka.data_service.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMessageRepository extends JpaRepository<StudentMessageEntity, Long> {
}