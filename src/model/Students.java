package model;

public class Students {
    String name;

    public Students(String name, int class_no, int age) {
        this.name = name;
        this.class_no = class_no;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClass_no() {
        return class_no;
    }

    public void setClass_no(int class_no) {
        this.class_no = class_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int class_no;
    int age;


    public void getFormat() {
        System.out.println("Format:" );
        System.out.println("Name  \t\t Class \t\t\t Age");
        System.out.println(this.name +"\t\t\t"+ this.class_no +"\t\t\t\t"+ this.age);
    }
}
