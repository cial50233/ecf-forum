package ecf.forum.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ecf.forum.api.dtos.MessageDto;
import ecf.forum.api.entities.Author;
import ecf.forum.api.entities.Message;
import ecf.forum.api.entities.Theme;
import ecf.forum.api.repositories.AuthorRepository;
import ecf.forum.api.repositories.MessageRepository;
import ecf.forum.api.repositories.ThemeRepository;

@Service
public class MessageServiceImpl implements MessageService {

	private final MessageRepository messages;

	private final AuthorRepository authors;

	private final ThemeRepository themes;

	public MessageServiceImpl(MessageRepository messages, AuthorRepository authors, ThemeRepository themes) {

		this.messages = messages;
		this.authors = authors;
		this.themes = themes;
	}

	@Override
	public void create(MessageDto dto) {

		Message message = new Message();

		Author author = authors.getOne(dto.getAuthor());
		message.setAuthor(author);

		Theme theme = themes.getOne(dto.getTheme());
		message.setTheme(theme);
		message.setLastModifiedDate(dto.getLast_modified_date());
		message.setTitle(dto.getTitle());
		message.setContent(dto.getMessage_content());
		//Message m = messages.getOne(dto.getMessage_lead());
		message.setLead(dto.getMessage_lead());
		messages.save(message);

	}

	@Override
	public void delete(Long id) {
		messages.deleteById(id);
	}

	@Override
	public Message getOne(Long id) {
		return messages.findById(id).get();
	}

	@Override
	public List<Message> getAll() {
		return messages.getAllProjectedBy();
	}

}
