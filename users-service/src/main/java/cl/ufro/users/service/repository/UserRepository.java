/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.ufro.users.service.repository;

import cl.ufro.users.service.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author matia
 */
public interface UserRepository extends CrudRepository<User, Long> {
    
}
