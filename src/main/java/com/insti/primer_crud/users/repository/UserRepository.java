package com.insti.primer_crud.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insti.primer_crud.users.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
