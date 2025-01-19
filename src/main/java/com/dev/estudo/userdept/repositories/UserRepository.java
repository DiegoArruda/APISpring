package com.dev.estudo.userdept.repositories;

import com.dev.estudo.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
