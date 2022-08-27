package model;

public class University {

    private String id;
    private String name;

    public University(String id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "universite id'si : " + id + "," +"universite adi : " + name;
    }
}
