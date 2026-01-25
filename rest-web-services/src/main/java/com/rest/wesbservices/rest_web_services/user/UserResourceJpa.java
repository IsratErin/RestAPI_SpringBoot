package com.rest.wesbservices.rest_web_services.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rest.wesbservices.rest_web_services.jpa.UserRepository;

import jakarta.validation.Valid;

@RestController
public class UserResourceJpa {

	private UserRepository repository;

	public UserResourceJpa(UserRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/jpa/users")
	public List<User> retrieveAllUser() {
		return repository.findAll();
	}

	@GetMapping("/jpa/users/{id}")
	public EntityModel<User> retrieveUserInfo(@PathVariable int id) {
		Optional<User> user = repository.findById(id);
		if (user == null)
			throw new UserNotFoundException("The User not found for id: " + id);
		EntityModel<User> entityModel = EntityModel.of(user.get());
		WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieveAllUser());
		entityModel.add(link.withRel("all-users"));
		return entityModel;
	}

	@PostMapping("/jpa/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User createdUser = repository.save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(createdUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping("/jpa/users/{id}")
	public void deleteUserById(@PathVariable int id) {
		repository.deleteById(id);

	}

}
