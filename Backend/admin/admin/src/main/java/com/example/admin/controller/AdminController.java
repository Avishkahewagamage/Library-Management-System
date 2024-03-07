/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.admin.controller;

import com.example.admin.entity.Admin;
import com.example.admin.service.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Chamashi Rikshma
 */
@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    
    @GetMapping(path = "/admins")
    public List<Admin> getAllAdmin(){
        return adminService.findAllAdmin();
    
}
    @GetMapping(path ="/admins/{id}")
    public Admin getAdminById(@PathVariable int id)
    {
        
       return adminService.getAdminById(id);
    }

@PostMapping(path = "/admins")
    public Admin createAdmin(@RequestBody Admin admin)
    {
        return adminService.createAdmin(admin);
    }
    
@PutMapping(path = "/admins")
    public Admin updateAdmin(@RequestBody Admin admin)
    {
        return adminService.updateAdmin(admin);
    }
    
@DeleteMapping(path = "/admins/{id}")
    public void deleteAdminById(@PathVariable int id)
    {
        adminService.deleteAdminById(id);
    }
}
