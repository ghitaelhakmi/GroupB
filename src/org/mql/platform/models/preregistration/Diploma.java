package org.mql.platform.models.preregistration;

import java.util.List;
import java.util.Vector;

/**
 * Candidates diplomas will become documents afterwards
 *
 * @author OussamaElrh
 */
public class Diploma {

  private String title;

  private String university;

  private String college;

  private String speciality;

  private String district;

  private int year;

  private int coef;

  private double grade;

  private String city;

  private List<Mark> marks;

  public Diploma() {

  }

  public Diploma(String title, String university, String college, String speciality,
      String district, int year, int coef, double grade,
      String city, List<Mark> marks) {
    setTitle(title);
    setUniversity(university);
    setCollege(college);
    setSpeciality(speciality);
    setDistrict(district);
    setYear(year);
    setCoef(coef);
    setGrade(grade);
    setCity(city);
    setMarks(marks);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUniversity() {
    return university;
  }

  public void setUniversity(String university) {
    this.university = university;
  }

  public String getCollege() {
    return college;
  }

  public void setCollege(String college) {
    this.college = college;
  }

  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getCoef() {
    return coef;
  }

  public void setCoef(int coef) {
    this.coef = coef;
  }

  public double getGrade() {
    return grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public List<Mark> getMarks() {
    return marks;
  }

  public void setMarks(List<Mark> marks) {
    this.marks = new Vector<>();
    this.marks.addAll(marks);
  }


  public String toString() {
    return "Diploma [title=" + title + ", univesity=" + university + ", college=" + college
        + ", speciality="
        + speciality + ", district=" + district + ", year=" + year + ", coef=" + coef + ", mention="
        + ", grade=" + grade + ", city=" + city + ", degrees=" + marks + "]";
  }

  // TODO: should be refactored to use JAXB
  public String toXml() {
    StringBuffer xml = new StringBuffer(
        "<diploma year ='" + getYear() + "' coef ='" + getCoef() + "'>");
    xml.append("<title>");
    xml.append(getTitle());
    xml.append("</title>");
    xml.append("<university>");
    xml.append(getUniversity());
    xml.append("</university>");
    xml.append("<college>");
    xml.append(getCollege());
    xml.append("</college>");
    xml.append("<speciality>");
    xml.append(getSpeciality());
    xml.append("</speciality>");
    xml.append("<district>");
    xml.append(getDistrict());
    xml.append("</district>");
    xml.append("<grade>");
    xml.append(getGrade());
    xml.append("</grade>");
    xml.append("<city>");
    xml.append(getCity());
    xml.append("</city>");
    xml.append("<marks>");
    for (Mark mark : marks) {
      xml.append(mark.toXml());
    }
    xml.append("</marks>");
    xml.append("</diploma>");
    return xml.toString();
  }
}
