package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// entity dennote le fait que notre class sera une table
@Entity
public class Student {
  // cette annotation est indispensable elle notre clef primaire
  @Id
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private Integer age;

  public Student(Long id, String firstName, String lastName, String email, Integer age) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.age = age;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student [age=" + age + ", email=" + email + ", firstName=" + firstName + ", id=" + id + ", lastName="
        + lastName + "]";
  }
}
