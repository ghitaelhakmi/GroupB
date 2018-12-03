/**
 * 
 */
package org.mql.platform.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 
 * 
 * @author Yassir SALIH
 *
 */
@Entity
public class EnterpriseContact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String fullName;

	private String email;

	private String phoneNumber;

	private String job;

	@ManyToOne
	private EnterpriseSite enterpriseSite;

	public EnterpriseContact() {

	}

	public EnterpriseContact(Integer id, String fullName, String email, String phoneNumber, String job,
			EnterpriseSite enterpriseSite) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.job = job;
		this.enterpriseSite = enterpriseSite;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public EnterpriseSite getEnterpriseSite() {
		return enterpriseSite;
	}

	public void setEnterpriseSite(EnterpriseSite enterpriseSite) {
		this.enterpriseSite = enterpriseSite;
	}

	@Override
	public String toString() {
		return "EnterpriseContact [id=" + id + ", fullName=" + fullName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", job=" + job + "]";
	}

}
