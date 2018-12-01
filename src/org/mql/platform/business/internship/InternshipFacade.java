/**
 * 
 */
package org.mql.platform.business.internship;

import java.util.List;
import java.util.Optional;

import org.mql.platform.models.EnterpriseContact;
import org.mql.platform.models.EnterpriseSite;
import org.mql.platform.models.Internship;

/**
 * 
 * The Services of "Internship, EnterpriseService, EnterpriseContact" CRUD'S operations.
 * 
 * @author Yassir SALIH
 *
 */
public interface InternshipFacade {

	/***
	 * 
	 * 
	 * @param internship
	 * @return
	 */

	boolean addInternship(Internship internship);

	Optional<Internship> findById(Integer id);

	List<Internship> findAll();

	Internship findByStudent(String cne);

	List<Internship> findByEnterprise(Integer id);

	void update(String subject, Integer id);

	void remove(Internship internship);

	/***
	 * 
	 * 
	 * @param enterpriseContact
	 * @return
	 */

	boolean addEnterpriseContact(EnterpriseContact enterpriseContact);

	Optional<EnterpriseContact> findEnterpriseContactById(Integer id);

	List<EnterpriseContact> findAllEnterpriseContacts();

	void removeEnterprisecontact(Integer id);

	/***
	 * 
	 * 
	 * @param enterpriseSite
	 * @return
	 */

	boolean addEnterpriseSite(EnterpriseSite enterpriseSite);

	Optional<EnterpriseSite> findEnterpriseSiteById(Integer id);

	List<EnterpriseSite> findAllEnterpriseSites();

	void removeEnterpriseSite(EnterpriseSite enterpriseSite);

}
