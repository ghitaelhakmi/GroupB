package org.mql.platform.models.preregistration;

/**
 * Candidates diplomas marks
 *
 * @author OussamaElrh
 **/
public class Mark {

  private String semester;

  private double value;

  public Mark() {
  }

  public Mark(String semester, double value) {
    this.semester = semester;
    this.value = value;
  }

  public String getSemester() {
    return semester;
  }

  public void setSemester(String semester) {
    this.semester = semester;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public String toString() {
    return "Degree [semester=" + semester + ", value=" + value + "]";
  }

  // TODO: to be refactored to use something like JAXB
  public String toXml() {
    return "<mark>" +
        "<semester>" + getSemester() + "</semester>" +
        "<value>" + getValue() + "</value>" +
        "</mark>";
  }

}
