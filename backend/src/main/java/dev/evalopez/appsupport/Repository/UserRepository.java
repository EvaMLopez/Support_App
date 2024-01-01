package dev.evalopez.appsupport.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.evalopez.appsupport.Model.User;

public interface UserRepository extends JpaRepository <User, Long> {
    
}
