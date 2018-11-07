package org.mql.platform.models;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 * @author mehdithe
 */
@Entity
public class Team {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToMany(mappedBy = "teams")
  private Set<Student> students;

  @ManyToMany(mappedBy = "teams")
  private Set<Project> projects;

  private String name;

  @OneToOne
  private Student teamLeader;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Set<Student> getStudents() {
    return students;
  }

  public void setStudents(Set<Student> students) {
    this.students = students;
  }

  public Set<Project> getProjects() {
    return projects;
  }

  public void setProjects(Set<Project> projects) {
    this.projects = projects;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Student getTeamLeader() {
    return teamLeader;
  }

  public void setTeamLeader(Student teamLeader) {
    this.teamLeader = teamLeader;
  }
}
