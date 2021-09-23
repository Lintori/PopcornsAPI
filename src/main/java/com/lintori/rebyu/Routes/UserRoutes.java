package com.lintori.rebyu.Routes;

import com.lintori.rebyu.Entities.User;
import com.lintori.rebyu.Services.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRoutes {

	private final UserService userService;

	public UserRoutes(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/")
	public List<User> getAllUsers() {
		return this.userService.findAllUsers();
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable(value = "id") String requestID) {
		return this.userService.findUser(requestID);
	}

	@PostMapping()
	public void postUser(@RequestBody User requestUser) {
		this.userService.addUser(requestUser);
	}

	@PutMapping("/{id}")
	public void putUser(@RequestBody User requestUser, @PathVariable(value = "id") String requestID) {
		this.userService.updateUser(requestUser, requestID);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable(value = "id") String requestID) {
		this.userService.deleteUser(requestID);
	}

}
