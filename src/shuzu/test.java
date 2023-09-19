package shuzu;

public class test {
    private String id;
    private String name;
    private double jiage;
    private int cun;

    public test(){}

    public test(String id, String name, double jiage, int cun) {
        this.id = id;
        this.name = name;
        this.jiage = jiage;
        this.cun = cun;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getJiage() {
        return jiage;
    }

    public int getCun() {
        return cun;
    }
}
