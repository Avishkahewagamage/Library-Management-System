/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.app.controller;

import com.example.app.LoginResponse.LoginResponse;
import com.example.app.dto.LoginDTO;
import com.example.app.dto.UserDTO;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lenovo
 */
@RestController
@CrossOrigin
@RequestMapping("api/v1/user")


public class UserController {
    
    @Autowired
    private UserService userService;
    
     @PostMapping(path="/save")
    public String saveUser(@RequestBody UserDTO userDTO){
        
        String id =userService.addUser(userDTO);
        return id;
    }
    
      @PostMapping(path="/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO){
        
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
        
       
    
}
