package com.github.owl4soul;

import javafx.util.Builder;

import javax.persistence.*;

@Entity
@Table(name = "usercreating")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String userName;
    private String firstName;
    private String lastName;
    private int phone;

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
        private int phone;

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

        public Builder _phone(int phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }


}
