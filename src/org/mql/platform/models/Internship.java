package org.mql.platform.models;

import java.time.LocalDate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author chermehdi
 * @author YassirSalih
 */
@Entity
public class Internship extends Experience {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String subject;

  @OneToOne(mappedBy = "endOfStudiesProject")
  private Student student;

  @ManyToOne
  private Enterprise enterprise;

  private String supervisor;

  private boolean remuneration;

  private boolean preEmployment;

  private String job;

  @OneToMany
  private List<Technology> technologies;

  private LocalDate startDate;

  private LocalDate endDate;

  public Internship() {
    student = new Student();
    enterprise = new Enterprise();
  }

  public Internship(Integer id, String subject, Student student, Enterprise enterprise,
      String supervisor,
      boolean remuneration, boolean preEmployment, String job, List<Technology> technologies,
      LocalDate startDate,
      LocalDate endDate) {
    super();
    this.id = id;
    this.subject = subject;
    this.student = student;
    this.enterprise = enterprise;
    this.supervisor = supervisor;
    this.remuneration = remuneration;
    this.preEmployment = preEmployment;
    this.job = job;
    this.technologies = technologies;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Enterprise getEnterprise() {
    return enterprise;
  }

  public void setEnterprise(Enterprise enterprise) {
    this.enterprise = enterprise;
  }

  public String getSupervisor() {
    return supervisor;
  }

  public void setSupervisor(String supervisor) {
    this.supervisor = supervisor;
  }

  public boolean isRemuneration() {
    return remuneration;
  }

  public void setRemuneration(boolean remuneration) {
    this.remuneration = remuneration;
  }

  public boolean isPreEmployment() {
    return preEmployment;
  }

  public void setPreEmployment(boolean preEmployment) {
    this.preEmployment = preEmployment;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public List<Technology> getTechnologies() {
    return technologies;
  }

  public void setTechnologies(List<Technology> technologies) {
    this.technologies = technologies;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return "Internship [id=" + id + ", subject=" + subject + ", student=" + student
        + ", enterprise=" + enterprise
        + "]";
  }
}
