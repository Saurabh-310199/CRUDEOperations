package com.crudoperation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudoperation.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
