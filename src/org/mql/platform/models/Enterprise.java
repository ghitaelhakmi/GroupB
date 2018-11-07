package org.mql.platform.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author anouarma
 * @author chermehdi
 */
@Entity
public class Enterprise {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  private String email;

  private int phoneNumber;

  private String website;

  @OneToMany(mappedBy = "enterprise")
  private List<Internship> internships = new ArrayList<>();

  @OneToMany
  private List<Address> address = new ArrayList<>();

  public Enterprise() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public List<Internship> getInternships() {
    return internships;
  }

  public void setInternships(List<Internship> internships) {
    this.internships = internships;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

}
