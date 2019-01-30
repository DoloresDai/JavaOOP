package Model;

public class Students {
    private String name;
    private int age;
    private String sex;
    private int id;

    Students(String name) {
        this.name = name;
    }

    Students(String name, int age) {
        this(name);
        this.age = age;
    }

    Students(String name, int age, String sex) {
        this(name, age);
        this.sex = sex;
    }

    Students(String name, int age, String sex, int id) {
        this(name, age, sex);
        this.id = id;
    }
}

