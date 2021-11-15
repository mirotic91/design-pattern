package me.mirotic.designpattern.creation.prototype.before;

import me.mirotic.designpattern.creation.prototype.after.GithubIssueAfter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

class PrototypeTest {

    @Test
    void before() {
        GithubRepository repository1 = new GithubRepository();
        repository1.setUser("jayden");
        repository1.setName("park");

        GithubIssueBefore issue1 = new GithubIssueBefore(repository1);
        issue1.setId(1);
        issue1.setTitle("prototype pattern");

        GithubRepository repository2 = new GithubRepository();
        repository2.setUser("jayden");
        repository2.setName("park");

        GithubIssueBefore issue2 = new GithubIssueBefore(repository2);
        issue2.setId(1);
        issue2.setTitle("prototype pattern");

        assertNotSame(issue1, issue2);
        assertEquals(issue1, issue2);
        assertNotSame(issue1.getRepository(), issue2.getRepository());
        assertSame(issue1.getClass(), issue2.getClass());
    }

    @Test
    void after() {
        GithubRepository repository = new GithubRepository();
        repository.setUser("jayden");
        repository.setName("park");

        GithubIssueAfter issue = new GithubIssueAfter(repository);
        issue.setId(1);
        issue.setTitle("prototype pattern");

        GithubIssueAfter clone = (GithubIssueAfter) issue.clone();

        assertNotSame(issue, clone);
        assertEquals(issue, clone);
        assertNotSame(issue.getRepository(), clone.getRepository());
        assertSame(issue.getClass(), clone.getClass());
    }
}