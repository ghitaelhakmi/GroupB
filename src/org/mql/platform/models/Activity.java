package org.mql.platform.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author mehdithe
 */
@Entity
public class Activity extends Publication {

  private String category;

  @ElementCollection
  private List<String> guests;

  private LocalDate activityDate;

  private LocalDateTime activityTime;

  public Activity() {
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public List<String> getGuests() {
    return guests;
  }

  public void setGuests(List<String> guests) {
    this.guests = guests;
  }

  public LocalDate getActivityDate() {
    return activityDate;
  }

  public void setActivityDate(LocalDate activityDate) {
    this.activityDate = activityDate;
  }

  public LocalDateTime getActivityTime() {
    return activityTime;
  }

  public void setActivityTime(LocalDateTime activityTime) {
    this.activityTime = activityTime;
  }
}