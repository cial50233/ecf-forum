package ecf.forum.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ecf.forum.api.dtos.MessageDto;
import ecf.forum.api.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Long>{

	List<Message> getAllProjectedBy();
}
