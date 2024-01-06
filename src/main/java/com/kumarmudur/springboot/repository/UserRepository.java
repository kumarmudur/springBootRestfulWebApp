package com.kumarmudur.springboot.repository;

import com.kumarmudur.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
