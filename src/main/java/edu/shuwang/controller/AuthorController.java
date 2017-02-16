package edu.shuwang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.shuwang.model.Author;
import edu.shuwang.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	private AuthorService authorService;
	
	@RequestMapping("/api/author/{id}")
	public Author getAuthorById(@PathVariable Long id) {
		Author a = authorService.findById(id);
		return a;
	}
	@RequestMapping("/api/author/byname")
	public Author getAuthorByName(@RequestParam("query") String query) {
		Author a = authorService.findByName(query);
		return a;
	}
	@RequestMapping(value = "/api/author", method = RequestMethod.POST)
	public Long saveAuthor(@RequestBody String authorName) {
		Author a = new Author(authorName);
		authorService.save(a);
		return a.getId();
	}
}
