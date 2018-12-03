package org.mql.platform.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author mehdithe
 */
@Entity
public class Address {

	@Id
	private int id;

	private String city;

	private int postalCode;

	private String address;

	@OneToOne(mappedBy = "address")
	private User owner;

	@OneToOne(mappedBy = "address")
	private EnterpriseSite enterpriseSite;

	public Address() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public EnterpriseSite getEnterpriseSite() {
		return enterpriseSite;
	}

	public void setEnterpriseSite(EnterpriseSite enterpriseSite) {
		this.enterpriseSite = enterpriseSite;
	}

}
