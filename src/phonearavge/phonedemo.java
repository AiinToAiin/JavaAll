package phonearavge;

public class phonedemo {
    private String name;
    private int number;
    private String color;

    public phonedemo() {
    }

    public phonedemo(String name, int number, String color) {
        this.name = name;
        this.number = number;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
