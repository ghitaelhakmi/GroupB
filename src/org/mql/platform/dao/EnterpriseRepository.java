package org.mql.platform.dao;

import org.mql.platform.models.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface EnterpriseRepository extends JpaRepository<Enterprise, Integer> {

}
