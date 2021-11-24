package me.mirotic.designpattern.structure.adapter.before.security;


/**
 * Target
 */
public interface UserDetailsService {

    UserDetails loadUser(String username);
}
