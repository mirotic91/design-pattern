package me.mirotic.designpattern.structure.adapter.after;


import me.mirotic.designpattern.structure.adapter.before.Account;
import me.mirotic.designpattern.structure.adapter.before.security.UserDetails;

/**
 * Adapter
 */
public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }


    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
