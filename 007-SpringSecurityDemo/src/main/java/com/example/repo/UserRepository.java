package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.UserBean;

public interface UserRepository extends JpaRepository<UserBean, Long>{
    public UserBean findByUname(String uname);
}
