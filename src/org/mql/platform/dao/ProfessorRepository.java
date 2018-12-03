package org.mql.platform.dao;

import org.mql.platform.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
