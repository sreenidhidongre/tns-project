package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepository adminRepository;

	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}
	
    @Override
    public List<Admin> fetchAdminList() {
        return adminRepository.findAll();
    }

   @Override
   public Admin fetchAdminById(Long adminId) {
	   return adminRepository.findById(adminId).get();
   }
	
   @Override
   public void deleteAdminById(Long adminId) {
       adminRepository.deleteById(adminId);
   }


   @Override
   public Admin updateAdmin(Long adminId, Admin admin) {
       Admin admDB = adminRepository.findById(adminId).get();

       if(Objects.nonNull(admin.getName()) &&
       !"".equalsIgnoreCase(admin.getName())) {
           admDB.setName(admin.getName());
       }

       if(Objects.nonNull(admin.getPassword()) &&
               !"".equalsIgnoreCase(admin.getPassword())) {
           admDB.setPassword(admin.getPassword());
       }

       return adminRepository.save(admDB);
   }


}
