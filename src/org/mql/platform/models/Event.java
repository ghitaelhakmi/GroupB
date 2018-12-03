package org.mql.platform.models;

import java.time.LocalDate;
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
public class Event extends Publication {

  @ElementCollection
  private List<String> guests;

  @ElementCollection
  private List<String> organizers;

  private LocalDate eventDate;

  public Event() {
  }

  public List<String> getGuests() {
    return guests;
  }

  public void setGuests(List<String> guests) {
    this.guests = guests;
  }

  public List<String> getOrganizers() {
    return organizers;
  }

  public void setOrganizers(List<String> organizers) {
    this.organizers = organizers;
  }

  public LocalDate getEventDate() {
    return eventDate;
  }

  public void setEventDate(LocalDate eventDate) {
    this.eventDate = eventDate;
  }
}
