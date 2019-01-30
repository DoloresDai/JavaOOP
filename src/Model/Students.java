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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getName() {
        System.out.println("姓名：" + this.name);
    }

    public void getAge() {
        if (this.age == 0) throw new NullException("年龄未设置");
        System.out.println("年龄：" + this.age);
    }

    public void getSex() {
        if (this.sex == null) throw new NullException("性别未设置");
        System.out.println("性别：" + this.sex);
    }

    public void getId() {
        if (this.id == 0) throw new NullException("学号未设置");
        System.out.println("学号：" + this.id);
    }
}

class NullException extends RuntimeException {
    NullException(String message) {
        super(message);
    }
}
