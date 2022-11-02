package net.usermanagement.model;


public class User {
    protected int id;
    protected String name;
    protected String email;
    protected String phone;
    protected String dob;

    public User() {}

    public User(String name, String email, String phone,String dob) {
        super();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
    }

    public User(int id, String name, String email, String phone , String dob) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }
    public String getdob() {
        return dob;
    }
    public void setdob(String dob) {
        this.dob = dob;
    }
}