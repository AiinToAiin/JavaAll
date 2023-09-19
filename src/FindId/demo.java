package FindId;

public class demo {
    private int id;
    private String usernam;
    private String password;

    public demo() {
    }

    public demo(int id, String usernam, String password) {
        this.id = id;
        this.usernam = usernam;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsernam() {
        return usernam;
    }

    public void setUsernam(String usernam) {
        this.usernam = usernam;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
