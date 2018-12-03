/**
 * 
 */
package org.mql.platform.business.internship.impl;

import java.util.List;
import java.util.Optional;

import org.mql.platform.business.internship.InternshipFacade;
import org.mql.platform.dao.EnterpriseContactRepository;
import org.mql.platform.dao.EnterpriseSiteRepository;
import org.mql.platform.dao.InternshipRepository;
import org.mql.platform.models.EnterpriseContact;
import org.mql.platform.models.EnterpriseSite;
import org.mql.platform.models.Internship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Yassir SALIH
 *
 */
@Service
public class DefaultInternshipFacade implements InternshipFacade {

	private InternshipRepository internshipRepository;
	private EnterpriseSiteRepository enterpriseSiteRepository;
	private EnterpriseContactRepository enterpriseContactRepository;

	@Autowired
	public DefaultInternshipFacade(InternshipRepository internshipRepository,
			EnterpriseSiteRepository enterpriseSiteRepository,
			EnterpriseContactRepository enterpriseContactRepository) {
		super();
		this.internshipRepository = internshipRepository;
		this.enterpriseSiteRepository = enterpriseSiteRepository;
		this.enterpriseContactRepository = enterpriseContactRepository;
	}

	@Transactional
	public boolean addInternship(Internship internship) {
		try {
			return internshipRepository.save(internship) != null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Optional<Internship> findById(Integer id) {
		try {
			Optional.of(internshipRepository.findById(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(null);
	}

	public List<Internship> findAll() {

		try {
			return internshipRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Internship findByStudent(String cne) {

		try {
			return internshipRepository.findByStudent(cne);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Internship> findByEnterprise(Integer id) {
		try {
			internshipRepository.findByEnterprise(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public void update(String subject, Integer id) {
		try {
			internshipRepository.update(subject, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional
	public void remove(Internship internship) {
		try {
			internshipRepository.deleteById(internship.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional
	public boolean addEnterpriseContact(EnterpriseContact enterpriseContact) {
		try {
			return enterpriseContactRepository.save(enterpriseContact) != null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Optional<EnterpriseContact> findEnterpriseContactById(Integer id) {
		try {
			Optional.of(enterpriseContactRepository.findById(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(null);
	}

	public List<EnterpriseContact> findAllEnterpriseContacts() {
		try {
			return enterpriseContactRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public void removeEnterprisecontact(Integer id) {
		try {
			enterpriseContactRepository.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Transactional
	public boolean addEnterpriseSite(EnterpriseSite enterpriseSite) {
		try {
			return enterpriseSiteRepository.save(enterpriseSite) != null;
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

		return false;
	}

	public Optional<EnterpriseSite> findEnterpriseSiteById(Integer id) {
		try {
			Optional.ofNullable(enterpriseSiteRepository.findById(id));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return Optional.ofNullable(null);
	}

	public List<EnterpriseSite> findAllEnterpriseSites() {
		try {
			return enterpriseSiteRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public void removeEnterpriseSite(EnterpriseSite enterpriseSite) {
		try {
			enterpriseSiteRepository.deleteById(enterpriseSite.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
