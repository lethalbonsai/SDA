package com.xhak.demo.service.impl;

import com.xhak.demo.entities.RoleEntity;
import com.xhak.demo.entities.UserEntity;
import com.xhak.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
public class MyUserDetails implements UserDetails {
    private UserEntity user;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<RoleEntity> roles = user.getRoles();

        Set<SimpleGrantedAuthority> listOfAllAccess =  new HashSet<>();
        for (RoleEntity role : roles){
            listOfAllAccess.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        return listOfAllAccess;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
