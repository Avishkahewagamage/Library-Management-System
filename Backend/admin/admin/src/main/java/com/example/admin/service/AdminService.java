/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.admin.service;

import com.example.admin.data.AdminRepository;
import com.example.admin.entity.Admin;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chamashi Rikshma
 */
@Service
public class AdminService {
    @Autowired
     private AdminRepository adminRepository;

    public List<Admin> findAllAdmin() {
        return adminRepository.findAll();
    
}
    public Admin getAdminById(int id)
    {
        Optional<Admin>adminOptional=adminRepository.findById(id);
        return adminOptional.get();
    }
    
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
    
    public Admin updateAdmin(Admin admin)
    {
        return adminRepository.save(admin);
    }
    
     public void  deleteAdminById(int id)
    {
        adminRepository.deleteById(id);
    }

    

    
}
