/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.ufro.users.service.controller;

import cl.ufro.users.service.model.User;
import cl.ufro.users.service.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author matia
 */
@RestController
@RequestMapping
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @GetMapping
    public List<User> index() {
        return this.userRepository.findAll();
    }
    
    @GetMapping("{id}")
    public Optional<User> show(@PathVariable("id") Long id) {
        return this.userRepository.findById(id);
    }
    
    @PostMapping
    public Long store(@RequestBody User user) {
        // Encrypt password
        user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        
        return this.userRepository.save(user).getId();
    }
    
    @PutMapping
    public Long update(@RequestBody User user) {
        if ( user.getId() != null ) {
            // Encrypt password
            user.setPassword(this.passwordEncoder.encode(user.getPassword()));

            return this.userRepository.save(user).getId();
        }
        return null;
    }
    
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable("id") Long id) {
        this.userRepository.deleteById(id);
        
        return true;
    }
}
