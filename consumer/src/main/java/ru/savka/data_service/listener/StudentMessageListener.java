package ru.savka.data_service.listener;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import ru.savka.data_service.data.StudentMessageEntity;
import ru.savka.data_service.data.StudentMessageRepository;
import ru.savka.data_service.dto.StudentMessage;

@Service
@RequiredArgsConstructor
public class StudentMessageListener {

    private final StudentMessageRepository repository;

    @RabbitListener(queues = "${app.rabbitmq.queue}")
    public void handleStudentMessage(StudentMessage message) {
        StudentMessageEntity entity = new StudentMessageEntity();
        entity.setFullName(message.getFullName());
        entity.setPassport(message.getPassport());
        entity.setCreatedAt(message.getCreatedAt());

        repository.save(entity);
    }
}
