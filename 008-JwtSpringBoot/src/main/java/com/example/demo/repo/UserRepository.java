package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserBean;

public interface UserRepository extends JpaRepository<UserBean, Long>{
    public UserBean findByUname(String uname);
}
