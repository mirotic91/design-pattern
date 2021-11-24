package me.mirotic.designpattern.structure.adapter.before;


/**
 * Adaptee
 */
public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username + "P@ssword");
        account.setEmail(username + "@gmail.com");
        return account;
    }

}
