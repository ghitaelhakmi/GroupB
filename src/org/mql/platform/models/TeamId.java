package org.mql.platform.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

/**
 * @author chermehdi
 */
@Embeddable
public class TeamId implements Serializable {

  @Enumerated
  private Level level;

  private String name;

  private int year;

  public TeamId() {
  }

  public TeamId(Level level, String name, int year) {
    this.level = level;
    this.name = name;
    this.year = year;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamId teamId = (TeamId) o;
    return year == teamId.year &&
        level == teamId.level &&
        Objects.equals(name, teamId.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, name, year);
  }
}
