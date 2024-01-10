package com.codeboyatwork.demoapp.repository;

import com.codeboyatwork.demoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
