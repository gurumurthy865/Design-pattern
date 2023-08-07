package com.example.demo.CreationalDesignPattern.Builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private String address;

    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.phoneNumber = userBuilder.phoneNumber;
        this.address = userBuilder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public  static class UserBuilder{
        private String firstName;
        private String lastName;

        private int age;
        private String phoneNumber;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public User build(){
            User user = new User(this);
            return user ;
        }
        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phoneNumber = phone;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }


    }
}

