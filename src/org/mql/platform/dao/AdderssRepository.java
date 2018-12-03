package org.mql.platform.dao;

import org.mql.platform.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chermehdi
 */
public interface AdderssRepository extends JpaRepository<Address, Integer> {

}
