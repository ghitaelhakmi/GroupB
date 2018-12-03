package org.mql.platform.dao;

import org.mql.platform.models.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
