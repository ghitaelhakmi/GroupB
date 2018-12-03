package org.mql.platform.dao;

import org.mql.platform.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface EventRepository extends JpaRepository<Event, Long> {

}
