package me.mirotic.designpattern.creation.prototype.example;


import lombok.Setter;
import lombok.ToString;
import me.mirotic.designpattern.creation.prototype.after.GithubIssueAfter;
import me.mirotic.designpattern.creation.prototype.before.GithubRepository;
import org.modelmapper.ModelMapper;


public class ModelMapperEx {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("jayden");
        repository.setName("park");

        GithubIssueAfter issue = new GithubIssueAfter(repository);
        issue.setId(1);
        issue.setTitle("prototype pattern");

        ModelMapper mapper = new ModelMapper();
        Data data = mapper.map(issue, Data.class);
        System.out.println(data);
    }


    @Setter
    @ToString
    private static class Data {

        private int id;

        private String title;

        private String repositoryUser;

        private String repositoryName;
    }
}
