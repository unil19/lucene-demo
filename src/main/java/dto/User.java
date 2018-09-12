package dto;

/**
 * @author liuwh33
 * @date 2018/9/12 10:40
 * @desc
 */
public class User {

    private String id;
    private String userName;
    private String job;

    public User(){

    }
    public User(String id, String userName, String job){
        this.id = id;
        this.userName = userName;
        this.job = job;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
