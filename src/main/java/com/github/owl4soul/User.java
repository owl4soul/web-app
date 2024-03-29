package com.github.owl4soul;

import javax.persistence.*;

@Entity
@Table(name = "userlist")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String userName;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "phone")
    private long phone;

    public User() {
    }

    private User(Builder builder) {
        this.userName = builder.userName;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phone = builder.phone;
    }

    //Builder
    public static class Builder {
        private String userName;
        private String firstName;
        private String lastName;
        private long phone;

        public Builder _userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder _firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder _lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder _phone(long phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

    public int getId() {
        return id;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
