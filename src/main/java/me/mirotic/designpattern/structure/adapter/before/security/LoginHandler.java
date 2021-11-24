package me.mirotic.designpattern.structure.adapter.before.security;


public class LoginHandler {

    private UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }


    public boolean login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        return userDetails.getPassword().equals(password);
    }
}