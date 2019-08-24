/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.ufro.auth.server.repository;

import cl.ufro.auth.server.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author matia
 */
public interface UserRepository extends CrudRepository<User, Long> {
    
    @Override
    public List<User> findAll();
    
    public Optional<User> findByEmail(String email);
    
}
