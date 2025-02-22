package ecf.forum.api.dtos;

import java.time.LocalDateTime;

public class MessageDto {
	
	
    private Long author;
	
    private Long theme;
	
    private LocalDateTime last_modified_date;
	
    private String title;
	
    private String message_content;
    
    private Long message_lead;
	
	public MessageDto() {
		
	}

	public Long getAuthor() {
		return author;
	}

	public void setAuthor(Long author) {
		this.author = author;
	}

	public Long getTheme() {
		return theme;
	}

	public void setTheme(Long theme) {
		this.theme = theme;
	}

	public LocalDateTime getLast_modified_date() {
		return last_modified_date;
	}

	public void setLast_modified_date(LocalDateTime last_modified_date) {
		this.last_modified_date = last_modified_date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage_content() {
		return message_content;
	}

	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}

	public Long getMessage_lead() {
		return message_lead;
	}

	public void setMessage_lead(Long message_lead) {
		this.message_lead = message_lead;
	}



}
