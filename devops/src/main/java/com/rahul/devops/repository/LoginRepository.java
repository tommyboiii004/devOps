package com.rahul.devops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahul.devops.domain.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,String> {
    Login findByUsernameAndPassword(String username,String password);
}
