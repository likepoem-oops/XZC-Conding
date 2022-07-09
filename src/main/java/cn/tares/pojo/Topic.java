package cn.tares.pojo;

public class Topic {
    private String topicId;
    private String major;
    private String topicName;
    private String introduction;
    private Integer number;
    private Integer currentNum;

    @Override
    public String toString() {
        return "Topic{" +
                "stu_tea_id='" + topicId + '\'' +
                ", major='" + major + '\'' +
                ", topicName='" + topicName + '\'' +
                ", introduction='" + introduction + '\'' +
                ", number=" + number +
                ", currentNum=" + currentNum +
                '}';
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
