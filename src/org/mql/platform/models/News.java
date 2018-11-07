package org.mql.platform.models;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

/**
 * @author mehdithe
 */
@Entity
public class News extends Publication {

  @Enumerated
  private NewsPriority priority;

  public News() {
  }

  public NewsPriority getPriority() {
    return priority;
  }

  public void setPriority(NewsPriority priority) {
    this.priority = priority;
  }

}
