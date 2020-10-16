package ecf.forum.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ecf.forum.api.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
