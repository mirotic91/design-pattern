package me.mirotic.designpattern.structure.adapter.after;


import me.mirotic.designpattern.structure.adapter.before.Account;
import me.mirotic.designpattern.structure.adapter.before.AccountService;
import me.mirotic.designpattern.structure.adapter.before.security.UserDetails;
import me.mirotic.designpattern.structure.adapter.before.security.UserDetailsService;


/**
 * Adapter
 */
public class AccountUserDetailsService implements UserDetailsService {

    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }


    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
