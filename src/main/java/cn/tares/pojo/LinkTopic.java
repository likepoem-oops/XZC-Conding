package cn.tares.pojo;

public class LinkTopic {
    private String topicId; // 课题号
    private String tno; //教师号
    private String topicName;
    private String isFull;


    @Override
    public String toString() {
        return "LinkTopic{" +
                "topicId='" + topicId + '\'' +
                ", tno='" + tno + '\'' +
                ", topicName='" + topicName + '\'' +
                ", isFull='" + isFull + '\'' +
                '}';
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getIsFull() {
        return isFull;
    }

    public void setIsFull(String isFull) {
        this.isFull = isFull;
    }
}
