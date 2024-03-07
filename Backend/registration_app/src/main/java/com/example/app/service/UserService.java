/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.app.service;

import com.example.app.LoginResponse.LoginResponse;
import com.example.app.dto.LoginDTO;
import com.example.app.dto.UserDTO;

/**
 *
 * @author Lenovo
 */
public interface UserService {

    String addUser(UserDTO userDTO);

    LoginResponse loginUser(LoginDTO loginDTO);
    
}
