package me.mirotic.designpattern.creation.prototype.after;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import me.mirotic.designpattern.creation.prototype.before.GithubRepository;


@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class GithubIssueAfter implements Cloneable {

    private Integer id;

    private String title;

    private GithubRepository repository;


    public GithubIssueAfter(GithubRepository repository) {
        this.repository = repository;
    }

    @Override
    public Object clone() {
        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setUser(repository.getUser());
        githubRepository.setName(repository.getName());

        GithubIssueAfter githubIssue = new GithubIssueAfter(githubRepository);
        githubIssue.setId(id);
        githubIssue.setTitle(title);
        return githubIssue;
    }

}
