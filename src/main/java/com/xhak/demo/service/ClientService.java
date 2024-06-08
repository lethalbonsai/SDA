package com.xhak.demo.service;

import com.xhak.demo.dto.clientDtos.CreateClientDTO;
import com.xhak.demo.dto.clientDtos.ResponseClientDTO;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<ResponseClientDTO> getAllClients();
    Optional<ResponseClientDTO> getClientById(Long id);
    Long createClient(CreateClientDTO createClientDTO);
    CreateClientDTO updateClient(Long id,CreateClientDTO createClientDTO);
    String deleteClient(Long id);
}
