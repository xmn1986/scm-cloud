package org.trc.scm.auth.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        GrantedAuthority authority1 = new SimpleGrantedAuthority("ROLE_MENU1");
        GrantedAuthority authority2 = new SimpleGrantedAuthority("ROLE_MENU2");
        grantedAuthorities.add(authority1);
        grantedAuthorities.add(authority2);
        return new User(username, "123456",
                true, true, true, true, grantedAuthorities);
    }
}
