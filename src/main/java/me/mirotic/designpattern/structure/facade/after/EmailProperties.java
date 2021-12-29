package me.mirotic.designpattern.structure.facade.after;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailProperties {

    private String host;

    public EmailProperties(String host) {
        this.host = host;
    }
}
