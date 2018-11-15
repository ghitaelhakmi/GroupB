package org.mql.platform.models;

import java.util.Set;
import javax.persistence.EmbeddedId;
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

  @EmbeddedId
  private TeamId id;

  @ManyToMany
  private Set<Student> students;

  @ManyToMany(mappedBy = "teams")
  private Set<Project> projects;

  @OneToOne
  private Student teamLeader;

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

  public Student getTeamLeader() {
    return teamLeader;
  }

  public void setTeamLeader(Student teamLeader) {
    this.teamLeader = teamLeader;
  }

  public TeamId getId() {
    return id;
  }

  public void setId(TeamId id) {
    this.id = id;
  }
}
