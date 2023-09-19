package StudentSystemMax;

public class StudentMassage {
    private int id;
    private String name;
    private int age;
    private String add;

    public StudentMassage() {
    }

    public StudentMassage(int id, String name, int age, String add) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.add = add;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
