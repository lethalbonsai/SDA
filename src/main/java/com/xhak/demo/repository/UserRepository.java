package com.xhak.demo.repository;

import com.xhak.demo.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
    List<UserEntity> findAllById(Long id);
    List<UserEntity> findAllByUsername(String username);
    List<UserEntity> findAllByEmail(String email);
    Optional<UserEntity> findById(Long id);
    Optional<UserEntity> findByUsername(String username);
    Optional<UserEntity> findByEmail(String email);
}
