package com.xhak.demo.service.impl;

import com.xhak.demo.dto.clientDtos.CreateClientDTO;
import com.xhak.demo.dto.clientDtos.ResponseClientDTO;
import com.xhak.demo.entities.ClientEntity;
import com.xhak.demo.mapper.ClientMapper;
import com.xhak.demo.repository.ClientRepository;
import com.xhak.demo.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ClientServiceFromDB implements ClientService {
    private ClientRepository clientRepository;
    private ClientMapper clientMapper;

    @Override
    public List<ResponseClientDTO> getAllClients() {
        List<ClientEntity> clientList = clientRepository.findAll();
        List<ResponseClientDTO> responseClientDTOList = new ArrayList<>();
        for (ClientEntity clientEntity : clientList) {
            responseClientDTOList.add(clientMapper.mapToResponseClientDTO(clientEntity));
        }
        return responseClientDTOList;
    }

    @Override
    public Optional<ResponseClientDTO> getClientById(Long id) {
        ClientEntity foundClient = clientRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Client with id: " + id + " was not found!"));
        return Optional.of(clientMapper.mapToResponseClientDTO(foundClient));
    }

    @Override
    public Long createClient(CreateClientDTO createClientDTO) {
        ClientEntity createClientEntity = clientMapper.mapToClientEntity(createClientDTO);
        ClientEntity savedClient = clientRepository.save(createClientEntity);
        return savedClient.getId();
    }

    @Override
    public CreateClientDTO updateClient(Long id, CreateClientDTO createClientDTO) {
        ClientEntity findClient = clientRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Client with id: " + id + " was not found!"));
        clientMapper.mapToClientEntity(createClientDTO);
        ClientEntity updatedClient = clientRepository.save(findClient);
        return clientMapper.mapToCreateClientEntity(updatedClient);
    }

    @Override
    public String deleteClient(Long id) {
        ClientEntity clientEntity = clientRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Client with id: " + id + " was not found!"));
        clientRepository.delete(clientEntity);
        return "Client with id: " + id + " was successfully deleted!";
    }
}
