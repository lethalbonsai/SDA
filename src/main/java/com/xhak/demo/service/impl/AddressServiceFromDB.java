package com.xhak.demo.service.impl;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.addressDtos.ResponseAddressDTO;
import com.xhak.demo.entities.AddressEntity;
import com.xhak.demo.mapper.AddressMapper;
import com.xhak.demo.repository.AddressRepository;
import com.xhak.demo.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AddressServiceFromDB implements AddressService {

    private AddressRepository addressRepository;
    private AddressMapper addressMapper;
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
        AddressEntity createAddressEntity = addressMapper.mapToAddressEntity(createAddressDTO);
        AddressEntity savedAddress = addressRepository.save(createAddressEntity);
        return savedAddress.getId();
    }

    @Override
    public CreateAddressDTO updateAddress(Long id, CreateAddressDTO createAddressDTO) {
        AddressEntity findAddress = addressRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Address with id: " + id + " was not found!"));
        addressMapper.mapToAddressEntity(createAddressDTO);
        AddressEntity updatedAddress = addressRepository.save(findAddress);
        return addressMapper.mapToCreateAddressEntity(updatedAddress);
    }

    @Override
    public String deleteAddress(Long id) {
        AddressEntity addressEntity = addressRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Address with id: " + id + " was not found!"));
        addressRepository.delete(addressEntity);
        return "Address with id: " + id + " was successfully deleted!";
    }

}
