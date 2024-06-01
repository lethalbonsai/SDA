package com.xhak.demo.repository;

import com.xhak.demo.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
        List<AddressEntity> findAllById(Long id);
        Optional<AddressEntity> findByCity(String city);
        Optional<AddressEntity> findByStreet(String street);
        Optional<AddressEntity> findByCityOrStreet(String city, String street);
        Boolean existsByState(String state);
        Boolean existsByCity(String city);
        Boolean existsByStreet(String street);
}
