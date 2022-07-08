package cn.tares.pojo;


// 教务人员
public class Faculty {
    private String fno;
    private String fname;
    private String password;

    @Override
    public String toString() {
        return "Faculty{" +
                "fno=" + fno +
                ", sname='" + fname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getFno() {
        return fno;
    }

    public void setFno(String fno) {
        this.fno = fno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
