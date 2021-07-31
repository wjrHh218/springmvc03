package pojo;

public class Users {
    private String uname;
    private String upass;
    private String reupass;

    public Users() {
    }

    public Users(String uname, String upass, String reupass) {
        this.uname = uname;
        this.upass = upass;
        this.reupass = reupass;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", reupass='" + reupass + '\'' +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getReupass() {
        return reupass;
    }

    public void setReupass(String reupass) {
        this.reupass = reupass;
    }
}
