package com.xhak.demo.mapper;

import com.xhak.demo.dto.clientDtos.CreateClientDTO;
import com.xhak.demo.dto.clientDtos.ResponseClientDTO;
import com.xhak.demo.entities.ClientEntity;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public ResponseClientDTO mapToResponseClientDTO(ClientEntity clientEntity) {
        ResponseClientDTO responseClientDTO = new ResponseClientDTO();
        responseClientDTO.setId(clientEntity.getId());
        responseClientDTO.setFirstName(clientEntity.getFirstName());
        responseClientDTO.setLastName(clientEntity.getLastName());
        responseClientDTO.setPhoneNumber(clientEntity.getPhoneNumber());
        responseClientDTO.setEmail(clientEntity.getEmail());
        responseClientDTO.setUsername(clientEntity.getUsername());
        return new ResponseClientDTO();
    }

    public ClientEntity mapToClientEntity(CreateClientDTO createClientDTO) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setFirstName(createClientDTO.getFirstName());
        clientEntity.setLastName(createClientDTO.getLastName());
        clientEntity.setPhoneNumber(createClientDTO.getPhoneNumber());
        clientEntity.setEmail(createClientDTO.getEmail());
        clientEntity.setUsername(createClientDTO.getUsername());
        return clientEntity;
    }
    public CreateClientDTO mapToCreateClientEntity(ClientEntity clientEntity) {
        CreateClientDTO createClientDTO = new CreateClientDTO();
        createClientDTO.setFirstName(clientEntity.getFirstName());
        createClientDTO.setLastName(clientEntity.getLastName());
        createClientDTO.setPhoneNumber(clientEntity.getPhoneNumber());
        createClientDTO.setEmail(clientEntity.getEmail());
        createClientDTO.setUsername(clientEntity.getUsername());
        return createClientDTO;
    }
}
