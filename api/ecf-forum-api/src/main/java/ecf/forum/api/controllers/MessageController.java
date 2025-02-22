package ecf.forum.api.controllers;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ecf.forum.api.dtos.MessageDto;
import ecf.forum.api.entities.Message;
import ecf.forum.api.services.MessageService;

@RestController
@RequestMapping("/messages")
@CrossOrigin("*")
public class MessageController {

	@Autowired
	private MessageService service;

	@PostMapping
	protected void create(@Valid @RequestBody MessageDto dto) {
		service.create(dto);
	}

	@DeleteMapping("/{id}")
	protected void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}

	@GetMapping("/{id}")
	protected Message getOne(@PathVariable("id") Long id) {
		return service.getOne(id);
	}

	@GetMapping
	public List<Message> getAll() {
		return service.getAll();
	}
}
