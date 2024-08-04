package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Admin;

public interface AdminService {

	Admin saveAdmin(Admin admin);

	List<Admin> fetchAdminList();

	Admin fetchAdminById(Long adminId);

	void deleteAdminById(Long adminId);

	Admin updateAdmin(Long adminId, Admin admin);

}
