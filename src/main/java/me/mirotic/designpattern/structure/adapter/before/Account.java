package me.mirotic.designpattern.structure.adapter.before;

import lombok.Getter;
import lombok.Setter;


/**
 * Adaptee
 */
@Getter
@Setter
public class Account {

    private String name;

    private String password;

    private String email;
}
