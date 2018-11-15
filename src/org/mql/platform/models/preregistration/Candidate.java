package org.mql.platform.models.preregistration;

import java.util.List;
import java.util.Vector;


/*
 * For managing new candidates yet to be MQL students
 *
 * @author OussamaElrh
 * */
public class Candidate {

  private String cin;

  private int cne;

  private String lastName;

  private String firstName;

  private int yearOfBirth;

  private String situation;

  private String city;

  private String gender;

  private boolean handicap;

  private List<Diploma> diplomas;

  private double mark;

  public Candidate() {
  }

  public Candidate(String cin, int cne, String lastName, String firstName, int dateOfBirth,
      String situation,
      String city, String gender, boolean handicap, List<Diploma> diplomas) {
    setCin(cin);
    setCne(cne);
    setLastName(lastName);
    setFirstName(firstName);
    setYearOfBirth(dateOfBirth);
    setSituation(situation);
    setCity(city);
    setGender(gender);
    setHandicap(handicap);
    setDiplomas(diplomas);
  }

  public String getCin() {
    return cin;
  }

  public void setCin(String cin) {
    this.cin = cin;
  }

  public int getCne() {
    return cne;
  }

  public void setCne(int cne) {
    this.cne = cne;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public int getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public String getSituation() {
    return situation;
  }

  public void setSituation(String situation) {
    this.situation = situation;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public boolean isHandicap() {
    return handicap;
  }

  public void setHandicap(boolean handicap) {
    this.handicap = handicap;
  }

  public List<Diploma> getDiplomas() {
    return diplomas;
  }

  public void setDiplomas(List<Diploma> diplomas) {
    this.diplomas = new Vector<Diploma>();
    this.diplomas.addAll(diplomas);
  }

  public double getMark() {
    return mark;
  }

  public void setMark(double mark) {
    this.mark = mark;
  }

  public String toString() {
    return "Candidate [cin=" + cin + ", cne=" + cne + ", lastName=" + lastName + ", firstName="
        + firstName + ", yearOfBirth=" + yearOfBirth + ", situation=" + situation + ", city=" + city
        + ", gender="
        + gender
        + ", handicap=" + handicap + ", diplomas=" + diplomas + "]";
  }

  // TODO: to be refactored to use something like JAXB
  public String toXml() {
    StringBuffer xml = new StringBuffer("<candidat cin ='" + getCin() + "'>");
    xml.append("<cne>" + getCne() + "</cne>");
    xml.append("<firstName>" + getFirstName() + "</firstName>");
    xml.append("<lastName>" + getLastName() + "</lastName>");
    xml.append("<yearOfBirth>" + getYearOfBirth() + "</yearOfBirth>");
    xml.append("<situation>" + getSituation() + "</situation>");
    xml.append("<city>" + getCity() + "</city>");
    xml.append("<handicap>" + isHandicap() + "</handicap>");
    xml.append("<diplomas>");
    for (Diploma diploma : diplomas) {
      xml.append(diploma.toXml());
    }
    xml.append("</diplomas>");
    xml.append("</candidat>");
    return xml.toString();
  }
}
