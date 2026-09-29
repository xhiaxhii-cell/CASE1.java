package com.system.models;

/**
 * Abstract base class representing a Person entity.
 * Demonstrates inheritance and encapsulation principles.
 */
public abstract class Person {
    
    // Attributes
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    
    // Constructor
    public Person(String firstName, String lastName, String email, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    // Getters
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract String getRole();
    
    // Common method
    @Override
    public String toString() {
        return String.format(
            "Name: %s\nEmail: %s\nPhone: %s\nAddress: %s\nRole: %s",
            getFullName(), email, phoneNumber, address, getRole()
        );
    }
}
