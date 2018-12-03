/**
 * 
 */
package org.mql.platform.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Yassir SALIH
 *
 */

@Entity
public class EnterpriseSite {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer id;
	
	private String name ;
	
	@OneToOne
	private Address address ;
	
	@OneToOne
	private Enterprise enterprise ;
	
	@OneToMany(mappedBy="enterpriseSite")
	private List<EnterpriseContact> enterpriseContacts = new ArrayList<>()  ;
	
	public EnterpriseSite() {
		address = new Address();
		enterprise = new Enterprise();
	}
	

	public EnterpriseSite(Integer id, String name, Address address, Enterprise enterprise) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.enterprise = enterprise;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	@Override
	public String toString() {
		return "EnterpriseSite [id=" + id +
				", name=" + name +
				", address=" + address + 
				", enterprise=" + enterprise + "]";
	}
	
	

}
