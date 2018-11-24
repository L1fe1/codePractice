package base.collection;

public class Student1 implements Comparable<Student1>{
    private String name;        // 姓名
    private int age;            // 年龄

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student1 o) {
        return this.age - o.age; // 比较年龄(年龄的升序)
    }
}
