package com.xhak.demo.controllers;

import com.xhak.demo.dto.addressDtos.CreateAddressDTO;
import com.xhak.demo.dto.addressDtos.ResponseAddressDTO;
import com.xhak.demo.service.AddressService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/address")
public class AddressController {
    private AddressService addressService;
    @GetMapping("/{id}")
    public ResponseEntity<ResponseAddressDTO> getAddressById(@PathVariable Long id) {
        Optional<ResponseAddressDTO> address = addressService.getAddressById(id);
        if (address.isPresent()) {
            return ResponseEntity.ok(address.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Long> createAddress(@RequestBody CreateAddressDTO address) {
        return ResponseEntity.ok(addressService.createAddress(address));
    }
    @PutMapping("/{id}")
    public ResponseEntity<CreateAddressDTO> updateAddress(@PathVariable Long id, @RequestBody CreateAddressDTO address) {
        return ResponseEntity.ok(addressService.updateAddress(id, address));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAddress(@PathVariable Long id) {
        return ResponseEntity.ok(addressService.deleteAddress(id));
    }
}
