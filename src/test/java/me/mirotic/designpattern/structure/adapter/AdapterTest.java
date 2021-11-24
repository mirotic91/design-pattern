package me.mirotic.designpattern.structure.adapter;

import me.mirotic.designpattern.structure.adapter.after.AccountUserDetailsService;
import me.mirotic.designpattern.structure.adapter.before.AccountService;
import me.mirotic.designpattern.structure.adapter.before.security.LoginHandler;
import me.mirotic.designpattern.structure.adapter.before.security.UserDetailsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class AdapterTest {

    @Test
    void test() {
        String username = "jayden";
        UserDetailsService userDetailsService = new AccountUserDetailsService(new AccountService());
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        assertFalse(loginHandler.login(username, username));
        assertTrue(loginHandler.login(username, username + "P@ssword"));
    }
}