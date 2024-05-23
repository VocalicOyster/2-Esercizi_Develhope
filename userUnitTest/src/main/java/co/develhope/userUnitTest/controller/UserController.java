package co.develhope.userUnitTest.controller;

import co.develhope.userUnitTest.DTOs.UserDTO;
import co.develhope.userUnitTest.entities.UserEntity;
import co.develhope.userUnitTest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/")
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @GetMapping("/list")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public UserEntity getUsersById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public UserEntity updateUser(@PathVariable Long id, @RequestParam String name) {
        return userService.upateName(id, name);
    }

    @DeleteMapping("/{id}")
    public UserEntity deleteUser(@PathVariable Long id) {
        return userService.deleteById(id);
    }
}
