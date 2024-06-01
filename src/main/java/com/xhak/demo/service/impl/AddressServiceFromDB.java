package com.xhak.demo.service.impl;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.addressDtos.ResponseAddressDTO;
import com.xhak.demo.entities.AddressEntity;
import com.xhak.demo.mapper.AddressMapper;
import com.xhak.demo.repository.AddressRepository;
import com.xhak.demo.repository.CategoryRepository;
import com.xhak.demo.service.AddressService;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class AddressServiceFromDB implements AddressService {

    private AddressRepository addressRepository;
    private AddressMapper addressMapper;
    private CategoryRepository categoryRepository;
    @Override
    public List<ResponseAddressDTO> getAllAddresses() {
        List<AddressEntity> addressList = addressRepository.findAll();
        List<ResponseAddressDTO> responseAddressDTOList = new ArrayList<>();
        for (AddressEntity addressEntity : addressList) {
            responseAddressDTOList.add(addressMapper.toResponseAddressDTO(addressEntity));
        }
        return responseAddressDTOList;
    }

    @Override
    public Optional<ResponseAddressDTO> getAddressById(Long id) {
        AddressEntity foundAddress = addressRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Address with id: " + id + " was not found!"));
        return Optional.of(addressMapper.toResponseAddressDTO(foundAddress));
    }

    @Override
    public Long createAddress(CreateAddressDTO createAddressDTO) {
        return null;
    }

    @Override
    public CreateAddressDTO updateAddress(Long id, CreateAddressDTO createAddressDTO) {
        return null;
    }

    @Override
    public String deleteAddress(Long id) {
        return null;
    }

}
