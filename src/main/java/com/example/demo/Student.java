package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

// entity dennote le fait que notre class sera une table
// name est le nom de la Table de le code et la bdd par default le nom de la 
// class est prise
@Entity(name = "Student")

// Table nous permet de parametrer notre table ici on indique que le nom de la
// de notre contrainte unique sur email porte le nom student_email_unique
// sans ça un nom aleatoire sera genéré par default
@Table(name = "student", uniqueConstraints = {
    @UniqueConstraint(name = "student_email_unique", columnNames = "email") })

public class Student {
  // cette annotation est indispensable elle notre clef primaire
  @Id
  // sequenceGenerator permet de faire lautoincrement sur l'id
  // l'alocation size est la pas d'increment en chaque nouveau id
  @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
  // column permet de specifier le name exact de la colonne de la bdd
  // et d'autre contrainte appliqué sur une colone
  @Column(name = "id", updatable = false)
  private Long id;

  // columnDefinition nous permet de spécifier le type des data de la column
  @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
  private String firstName;

  @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
  private String lastName;

  @Column(name = "email", nullable = false, columnDefinition = "TEXT", unique = true)
  private String email;

  @Column(name = "age", nullable = false)
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
