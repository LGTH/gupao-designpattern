package com.lg.gupao.prototype.bean;

/**
 * @ClassName User
 * @Auther: LG
 * @Description
 * @Date 2019/3/13
 **/
public class User {
    private String id;

    private String name;

    private String password;

    private String email;

    private Integer loginTimes;

    private String telephone;

    private String describe;

    private String mainProject;

    private String activation;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getMainProject() {
        return mainProject;
    }

    public void setMainProject(String mainProject) {
        this.mainProject = mainProject == null ? null : mainProject.trim();
    }


    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation == null ? null : activation.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", loginTimes=" + loginTimes +
                ", telephone='" + telephone + '\'' +
                ", describe='" + describe + '\'' +
                ", mainProject='" + mainProject + '\'' +
                ", activation='" + activation + '\'' +
                '}';
    }
}
