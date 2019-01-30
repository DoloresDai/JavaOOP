package Model;
public class StudentsDemo {
    public static void main(String[] args) {
        Students students = new Students("张三",20,"男",2015214328);
        students.getName();
        students.getAge();
        students.getSex();
        students.getId();
        students.setName("张大帅");
        students.setAge(22);
        students.setSex("不男不女");
        students.setId(2015214329);
        System.out.println("-----修改数据后-----");
        students.getName();
        students.getAge();
        students.getSex();
        students.getId();
    }
}
