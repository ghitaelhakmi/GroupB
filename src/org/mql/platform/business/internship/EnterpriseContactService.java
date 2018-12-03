/**
 * 
 */
package org.mql.platform.business.internship;

import java.util.List;
import java.util.Optional;

import org.mql.platform.models.EnterpriseContact;

/**
 * @author Yassir SALIH
 *
 */
public interface EnterpriseContactService {

	boolean add(EnterpriseContact enterpriseContact);

	Optional<EnterpriseContact> findById(Integer id);

	List<EnterpriseContact> findAll();

	void remove(Integer id);

}
