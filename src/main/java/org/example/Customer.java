package org.example;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "cust")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Basic
    private String Name;
    @Basic
    private String Email;

    @Basic
    private int  phone;
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "vlg",column=@Column(name = "village")),
            @AttributeOverride(name = "State",column=@Column(name = "states")),
            @AttributeOverride(name = "pin",column=@Column(name = "pincode")),
    })
    private  Adress adress;

    public Customer()
    {

    }

    public Customer(String name, String email, int phone, Adress adress) {
        Name = name;
        Email = email;
        this.phone = phone;
        this.adress = adress;
    }

    public Customer(String name, String email, int phone) {
        Name = name;
        Email = email;
        this.phone = phone;
    }
    public Customer(int id, String name, String email, int phone) {
        this.id = id;
        Name = name;
        Email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", phone=" + phone +
                "adress"+adress.toString()+
                '}';
    }
}
