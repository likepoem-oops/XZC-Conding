package cn.tares.pojo;

import org.apache.ibatis.annotations.Select;

public class LinkStudent {

    private String sno;
    private String topicId;
    private String sname;
    private String major;

    @Override
    public String toString() {
        return "LinkStudent{" +
                "sno='" + sno + '\'' +
                ", topicId='" + topicId + '\'' +
                ", sname='" + sname + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
