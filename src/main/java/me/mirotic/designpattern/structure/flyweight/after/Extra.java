package me.mirotic.designpattern.structure.flyweight.after;


import lombok.ToString;

@ToString
public class Extra {

    private Integer age;

    private String grade;

    public Extra(Integer age) {
        this.age = age;

        if (age < 14) {
            this.grade = "elementary";
        } else if (age < 17) {
            this.grade = "middle";
        } else {
            this.grade = "high";
        }
    }
}
