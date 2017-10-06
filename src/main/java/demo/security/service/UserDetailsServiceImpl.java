package demo.security.service;

import demo.security.model.UserRole;
import demo.security.model.UserTallShip;
import demo.security.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRep userRep;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserTallShip userTallShip = userRep.findUserByName(username);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (UserRole role : userTallShip.getUserRole()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }

        return new org.springframework.security.core.userdetails.User(userTallShip.getUsername(), userTallShip.getPassword(), grantedAuthorities) {
        };
    }
}
