package me.mirotic.designpattern.creation.prototype.before;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class GithubIssueBefore {

    private Integer id;

    private String title;

    private GithubRepository repository;


    public GithubIssueBefore(GithubRepository repository) {
        this.repository = repository;
    }

}
