package com.skillstorm.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillstorm.telecom.beans.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
