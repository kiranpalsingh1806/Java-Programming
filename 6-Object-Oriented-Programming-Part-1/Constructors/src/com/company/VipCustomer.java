package com.company;

public class VipCustomer {
    private String name;
    private Integer limit;
    private String email;

    public VipCustomer() {
        this("Kiranpal Singh", 1200, "kiranpalsingh@gmail.com");
    }

    public VipCustomer(String name, Integer limit) {
        this(name, limit, "default@gmail.com");
    }

    public VipCustomer(String name, Integer limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
