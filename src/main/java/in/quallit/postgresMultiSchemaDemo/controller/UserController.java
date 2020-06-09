package in.quallit.postgresMultiSchemaDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.quallit.postgresMultiSchemaDemo.entity.User;
import in.quallit.postgresMultiSchemaDemo.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public ResponseEntity<List<User>> getAll() {
		return ResponseEntity.ok(this.userRepository.findAll());
	}
}
