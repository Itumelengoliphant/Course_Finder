package com.example.demoapp;

public class College {

    private String name;
    private String province;
    private String city;
    private String address;
    private String acronym;
    private String web;
    private String mail;
    private String tel;
    private  String des;

    public College(String name, String province, String city, String address, String acronym, String web, String mail,String tel, String des) {
        this.name = name;
        this.province = province;
        this.city = city;
        this.address = address;
        this.acronym = acronym;
        this.web = web;
        this.mail = mail;
        this.tel = tel;
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
