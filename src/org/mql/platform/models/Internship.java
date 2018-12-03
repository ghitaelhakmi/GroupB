package org.mql.platform.models;

import java.time.LocalDate;

import java.util.Date;
import java.util.List;

import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author chermehdi
 * @author YassirSalih
 */
@Entity
public class Internship extends Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String subject;

	@OneToOne(mappedBy = "endOfStudiesProject")
	private Student student;

	@ManyToOne
	private Enterprise enterprise;

	private String supervisor;

	private boolean remuneration;

	private boolean preEmployment;

	private String business;

	@OneToMany
	private List<Technology> technologies;

	@OneToMany
	private Set<Document> documents;

	@Temporal(TemporalType.DATE)
	private Date defenseDate;

	private LocalDate internshipStart;

	private LocalDate internshipEnd;

	@ElementCollection
	private List<String> jury;

	private double mark;

	public Internship() {
		student = new Student();
		enterprise = new Enterprise();
	}

	public Internship(Integer id, String subject, Student student, Enterprise enterprise, String supervisor,
			boolean remuneration, boolean preEmployment, String business, List<Technology> technologies,
			LocalDate internshipStart, LocalDate internshipEnd) {
		super();
		this.id = id;
		this.subject = subject;
		this.student = student;
		this.enterprise = enterprise;
		this.supervisor = supervisor;
		this.remuneration = remuneration;
		this.preEmployment = preEmployment;
		this.business = business;
		this.technologies = technologies;
		this.internshipEnd = internshipEnd;
		this.internshipEnd = internshipEnd;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public boolean isRemuneration() {
		return remuneration;
	}

	public void setRemuneration(boolean remuneration) {
		this.remuneration = remuneration;
	}

	public boolean isPreEmployment() {
		return preEmployment;
	}

	public void setPreEmployment(boolean preEmployment) {
		this.preEmployment = preEmployment;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}

	public LocalDate getInternshipStart() {
		return internshipStart;
	}

	public void setInternshipStart(LocalDate internshipStart) {
		this.internshipStart = internshipStart;
	}

	public LocalDate getInternshipEnd() {
		return internshipEnd;
	}

	public void setInternshipEnd(LocalDate internshipEnd) {
		this.internshipEnd = internshipEnd;
	}

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

	public Date getDefenseDate() {
		return defenseDate;
	}

	public void setDefenseDate(Date defenseDate) {
		this.defenseDate = defenseDate;
	}

	public List<String> getJury() {
		return jury;
	}

	public void setJury(List<String> jury) {
		this.jury = jury;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Internship [id=" + id +
				", subject=" + subject +
				", student=" + student +
				", enterprise=" + enterprise + "]";
	}
}
