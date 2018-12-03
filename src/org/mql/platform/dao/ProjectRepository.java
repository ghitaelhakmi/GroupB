package org.mql.platform.dao;

import org.mql.platform.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
