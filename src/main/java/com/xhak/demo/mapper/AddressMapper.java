package com.xhak.demo.mapper;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.addressDtos.ResponseAddressDTO;
import com.xhak.demo.entities.AddressEntity;

public class AddressMapper {
    public ResponseAddressDTO toResponseAddressDTO(AddressEntity addressEntity) {
        ResponseAddressDTO responseAddressDTO = new ResponseAddressDTO();
        responseAddressDTO.setId(addressEntity.getId());
        responseAddressDTO.setState(addressEntity.getState());
        responseAddressDTO.setCity(addressEntity.getCity());
        responseAddressDTO.setStreet(addressEntity.getStreet());
        responseAddressDTO.setZipCode(addressEntity.getZipCode());
        return new ResponseAddressDTO();
    }
    public AddressEntity mapToAddressEntity(CreateAddressDTO createAddressDTO) {
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setState(createAddressDTO.getState());
        addressEntity.setCity(createAddressDTO.getCity());
        addressEntity.setStreet(createAddressDTO.getStreet());
        addressEntity.setZipCode(createAddressDTO.getZipCode());
        return addressEntity;
    }
}
