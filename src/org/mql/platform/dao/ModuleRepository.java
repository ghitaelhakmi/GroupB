package org.mql.platform.dao;

import org.mql.platform.models.Module;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface ModuleRepository extends JpaRepository<Module, Integer> {

}
