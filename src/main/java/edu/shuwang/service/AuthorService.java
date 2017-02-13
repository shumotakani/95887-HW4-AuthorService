package edu.shuwang.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import edu.shuwang.model.Author;

@Service
public interface AuthorService extends CrudRepository<Author, Long> {

    Author findByName(String name);

}
