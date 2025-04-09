package com.example.Img_Store;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prop")
public class Prop {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String frist_name;
    private String last_name;
    private String mobile_number;
    private String email;
    private String massage;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFrist_name() {
        return frist_name;
    }
    public void setFrist_name(String frist_name) {
        this.frist_name = frist_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getMobile_number() {
        return mobile_number;
    }
    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMassage() {
        return massage;
    }
    public void setMassage(String massage) {
        this.massage = massage;
    }
    @Override
    public String toString() {
        return "Prop [id=" + id + ", frist_name=" + frist_name + ", last_name=" + last_name + ", mobile_number="
                + mobile_number + ", email=" + email + ", massage=" + massage + "]";
    }


    
}
