package com.xhak.demo.service;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    List<CreateAddressDTO> getAllAddresses();
    Optional<CreateAddressDTO> getAddressById(Long id);
    Long createAddress(CreateAddressDTO createAddressDTO);
    CreateAddressDTO updateAddress(Long id, CreateAddressDTO createAddressDTO);
    String deleteAddress(Long id);
}
