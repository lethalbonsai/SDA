package com.xhak.demo.service.impl;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.addressDtos.ResponseAddressDTO;
import com.xhak.demo.entities.AddressEntity;
import com.xhak.demo.repository.AddressRepository;
import com.xhak.demo.service.AddressService;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class AddressServiceFromDB implements AddressService {

    private AddressRepository addressRepository;
    @Override
    public List<CreateAddressDTO> getAllAddresses() {
        List<AddressEntity> addressList = addressRepository.findAll();
        List<ResponseAddressDTO> responseAddressDTOList = new ArrayList<>();
//        for (AddressEntity addressEntity : addressList) {
//            responseAddressDTOList.add();
//        }
        return null;
    }

    @Override
    public Optional<CreateAddressDTO> getAddressById(Long id) {
        return Optional.empty();
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
