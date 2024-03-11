package com.example.security.domain.service;

import com.example.security.domain.model.entity.Role;

import java.util.List;

public interface RoleService {

    void seed();
    List<Role> getAll();

}
