package ecf.forum.api.services;

import java.util.List;

import ecf.forum.api.dtos.MessageDto;
import ecf.forum.api.entities.Message;

public interface MessageService {
	
	void create(MessageDto dto);

    void delete(Long id);

    Message getOne(Long id);
    
    List<Message> getAll();

}
