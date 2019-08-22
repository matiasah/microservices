/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.ufro.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * @author matia
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class Application {
    
    public static void main(String [] args) {
        SpringApplication.run(Application.class, args);
    }
    
}
