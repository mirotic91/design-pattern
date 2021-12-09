package me.mirotic.designpattern.structure.decorator;

import me.mirotic.designpattern.structure.decorator.after.CommentDecorator;
import me.mirotic.designpattern.structure.decorator.after.DefaultCommentService;
import me.mirotic.designpattern.structure.decorator.after.SpamFilteringCommentDecorator;
import me.mirotic.designpattern.structure.decorator.after.TrimmingCommentDecorator;
import me.mirotic.designpattern.structure.decorator.before.CommentService;
import me.mirotic.designpattern.structure.decorator.before.SpamFilteringCommentService;
import me.mirotic.designpattern.structure.decorator.before.TrimmingCommentService;
import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    void before() {
        printComment(new CommentService());
        printComment(new TrimmingCommentService());
        printComment(new SpamFilteringCommentService());
//        printComment(new TrimmingAndSpamFilteringCommentService()); // Trimming * SpamFiltering 조합 불가로 신규 클래스 필요
    }

    private void printComment(me.mirotic.designpattern.structure.decorator.before.CommentService commentService) {
        commentService.addComment("hello world!");
        commentService.addComment("test...");
        commentService.addComment("https://www.google.com");
        System.out.println("-----------------------------");
    }

    @Test
    void after() {
        DefaultCommentService commentService = new DefaultCommentService();
        printComment(new CommentDecorator(commentService));
        printComment(new TrimmingCommentDecorator(commentService));
        printComment(new SpamFilteringCommentDecorator(commentService));
        printComment(new TrimmingCommentDecorator(new SpamFilteringCommentDecorator(commentService)));
    }

    private void printComment(me.mirotic.designpattern.structure.decorator.after.CommentService commentService) {
        commentService.addComment("hello world!");
        commentService.addComment("test...");
        commentService.addComment("https://www.google.com ...");
        System.out.println("-----------------------------");
    }
}