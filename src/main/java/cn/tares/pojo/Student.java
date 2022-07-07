package cn.tares.pojo;


public class Student {


    private Integer sno;
    private String name;
    private String password;
    private String topicPick;
    private String major;


    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", topicPick='" + topicPick + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTopicPick() {
        return topicPick;
    }

    public void setTopicPick(String topicPick) {
        this.topicPick = topicPick;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
