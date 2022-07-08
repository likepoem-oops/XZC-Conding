package cn.tares.pojo;


// 教师
public class Teacher {

    private String tno;
    private String tname;
    private String password;
    private String etopic; // 套的壳子 实际是专业
    private String introduction;

    @Override
    public String toString() {
        return "Teacher{" +
                "tno=" + tno +
                ", tname='" + tname + '\'' +
                ", password='" + password + '\'' +
                ", etopic='" + etopic + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEtopic() {
        return etopic;
    }

    public void setEtopic(String etopic) {
        this.etopic = etopic;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
