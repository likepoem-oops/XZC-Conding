package cn.tares.pojo;


// 系主任
public class Department {

    private String dno;
    private String dname;
    private String password;
    private String major;

    @Override
    public String toString() {
        return "Department{" +
                "dno=" + dno +
                ", dname='" + dname + '\'' +
                ", password='" + password + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
