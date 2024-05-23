package co.develhope.userUnitTest.controller;

import co.develhope.userUnitTest.exceptions.UserException;
import co.develhope.userUnitTest.utilities.validator.UserValidator;
import models.DTOs.UserDTO;
import co.develhope.userUnitTest.entities.UserEntity;
import co.develhope.userUnitTest.services.UserService;
import models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/")
    public ResponseEntity<Response> createUser(@RequestBody UserDTO userDTO) throws UserException {
        try {
            UserDTO newUser = userService.createUser(userDTO);
            return ResponseEntity.ok().body(
                    new Response(200,
                            "User added successfully",
                            newUser
                    )
            );
        }
        catch (UserException e) {
            return ResponseEntity.status(400).body(
                    new Response(400,
                            e.getMessage())
            );
        }
    }

    @GetMapping("/list")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getUsersById(@PathVariable Long id) {
        try {
            UserEntity userEntity = userService.getUserById(id);
            return ResponseEntity.ok().body(
                    new Response(200,
                    "User found correctly",
                    userEntity
            ));
        } catch (UserException e) {
            return ResponseEntity.status(400).body(
                    new Response(400,
                            "User not found")
            );
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Response> updateUser(@PathVariable Long id, @RequestParam String name) {
        try {
            UserEntity user = userService.upateName(id, name);
            return ResponseEntity.ok().body(
                    new Response(200,
                            "User modified correctly",
                            user
                    ));
        } catch (UserException e) {
            return ResponseEntity.status(400).body(
                    new Response(400,
                            e.getMessage())
            );
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> deleteUser(@PathVariable Long id) {
        try {
            UserEntity user = userService.deleteById(id);
            return ResponseEntity.ok().body(
                    new Response(200,
                            "User deleted correctily",
                            user
                    )
            );
        } catch (UserException e) {
            return ResponseEntity.status(400).body(
                    new Response(400,
                            "ID not found"
                    )
            );
        }
    }
}
