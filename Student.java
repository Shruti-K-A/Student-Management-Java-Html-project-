

public class Student {
    private String name;
    private int id;
    private int age;
    private String dept;

    public Student(String name, int id, int age, String dept) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }
}

