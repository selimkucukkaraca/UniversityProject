package model;

public class Teacher {

    private String id;
    private String name;
    private String lastName;
    private int age;
    private University university;

    public Teacher(String id, String name, String lastName, int age, University university) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.university = university;
    }

    /*
    public Teacher(String name, String lastName, int age, University university) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.university = university;
    }
    */

    public Teacher(String toString, String name, String lastname, String age, String university, University university1) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return  id + "," + name + "," + lastName + "," + age + "," + university;
    }
}
