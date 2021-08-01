package com.example.testarvalk8s.controllers;

import com.example.testarvalk8s.entities.AppUser;
import com.example.testarvalk8s.repositories.AppUserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppUserController {

    private final AppUserRepository userRepository;

    public AppUserController(AppUserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<AppUser> getUser(@PathVariable(value = "id") Long id){
        AppUser user = userRepository.findById(id).orElseThrow(() -> new RessourceNotFoundException("User not found"));
        return ResponseEntity.ok().body(user);
    }
    @PostMapping("/adduser")
    public ResponseEntity<AppUser> addUser(@RequestBody AppUser user){
        AppUser userAdded = userRepository.save(user);
        return ResponseEntity.ok().body(userAdded);
    }
    @GetMapping("/users")
    public List<AppUser> findAll(){
       // List<AppUser> users = userRepository.findAll();
        return userRepository.findAll();
    }
}
