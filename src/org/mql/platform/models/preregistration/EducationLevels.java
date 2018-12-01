package org.mql.platform.models.preregistration;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="educationlevels")
public class EducationLevels {
	private int baccalaureateYear;
	// information about the DUT/DEUG ... diplomas
	private String secondeLevelType;
	private String secondeLevelName;
	private String secondeLevelEstablishment;
	private String secondeLevelCity;
	private int secondeLevelYear;
	//information about the LST/LP/LF ... diplomas
	private String thirdLevelType;
	private String thirdLevelName;
	private String thirdLevelUniversity;
	private String thirdLevelEstablishment;
	private String thirdLevelCity;
	private int thirdLevelYear;
	//Array of semester marks
	private double s1Mark;
	private double s2Mark;
	private double s3Mark;
	private double s4Mark;
	private double s5Mark;
	private double s6Mark;
	//general mark of the candidate's participation
	private double mark;

	public EducationLevels() {
		
	}

	public EducationLevels(int baccalaureateYear, String secondeLevelType, String secondeLevelName,
			String secondeLevelEstablishment, String secondeLevelCity,
			int secondeLevelYear, String thirdLevelType, String thirdLevelName, String thirdLevelUniversity,
			String thirdLevelEstablishment, String thirdLevelCity, int thirdLevelYear, double s1Mark, double s2Mark,
			double s3Mark, double s4Mark, double s5Mark, double s6Mark, double mark) {
		super();
		this.baccalaureateYear = baccalaureateYear;
		this.secondeLevelType = secondeLevelType;
		this.secondeLevelName = secondeLevelName;
		this.secondeLevelEstablishment = secondeLevelEstablishment;
		this.secondeLevelCity = secondeLevelCity;
		this.secondeLevelYear = secondeLevelYear;
		this.thirdLevelType = thirdLevelType;
		this.thirdLevelName = thirdLevelName;
		this.thirdLevelUniversity = thirdLevelUniversity;
		this.thirdLevelEstablishment = thirdLevelEstablishment;
		this.thirdLevelCity = thirdLevelCity;
		this.thirdLevelYear = thirdLevelYear;
		this.s1Mark = s1Mark;
		this.s2Mark = s2Mark;
		this.s3Mark = s3Mark;
		this.s4Mark = s4Mark;
		this.s5Mark = s5Mark;
		this.s6Mark = s6Mark;
		this.mark = mark;
	}

	public int getBaccalaureateYear() {
		return baccalaureateYear;
	}

	public void setBaccalaureateYear(int baccalaureateYear) {
		this.baccalaureateYear = baccalaureateYear;
	}

	public String getSecondeLevelType() {
		return secondeLevelType;
	}

	public void setSecondeLevelType(String secondeLevelType) {
		this.secondeLevelType = secondeLevelType;
	}

	public String getSecondeLevelName() {
		return secondeLevelName;
	}

	public void setSecondeLevelName(String secondeLevelName) {
		this.secondeLevelName = secondeLevelName;
	}

	public String getSecondeLevelEstablishment() {
		return secondeLevelEstablishment;
	}

	public void setSecondeLevelEstablishment(String secondeLevelEstablishment) {
		this.secondeLevelEstablishment = secondeLevelEstablishment;
	}

	public String getSecondeLevelCity() {
		return secondeLevelCity;
	}

	public void setSecondeLevelCity(String secondeLevelCity) {
		this.secondeLevelCity = secondeLevelCity;
	}

	public int getSecondeLevelYear() {
		return secondeLevelYear;
	}

	public void setSecondeLevelYear(int secondeLevelYear) {
		this.secondeLevelYear = secondeLevelYear;
	}

	public String getThirdLevelType() {
		return thirdLevelType;
	}

	public void setThirdLevelType(String thirdLevelType) {
		this.thirdLevelType = thirdLevelType;
	}

	public String getThirdLevelName() {
		return thirdLevelName;
	}

	public void setThirdLevelName(String thirdLevelName) {
		this.thirdLevelName = thirdLevelName;
	}

	public String getThirdLevelUniversity() {
		return thirdLevelUniversity;
	}

	public void setThirdLevelUniversity(String thirdLevelUniversity) {
		this.thirdLevelUniversity = thirdLevelUniversity;
	}

	public String getThirdLevelEstablishment() {
		return thirdLevelEstablishment;
	}

	public void setThirdLevelEstablishment(String thirdLevelEstablishment) {
		this.thirdLevelEstablishment = thirdLevelEstablishment;
	}

	public String getThirdLevelCity() {
		return thirdLevelCity;
	}

	public void setThirdLevelCity(String thirdLevelCity) {
		this.thirdLevelCity = thirdLevelCity;
	}

	public int getThirdLevelYear() {
		return thirdLevelYear;
	}

	public void setThirdLevelYear(int thirdLevelYear) {
		this.thirdLevelYear = thirdLevelYear;
	}

	public double getS1Mark() {
		return s1Mark;
	}

	public void setS1Mark(double s1Mark) {
		this.s1Mark = s1Mark;
	}

	public double getS2Mark() {
		return s2Mark;
	}

	public void setS2Mark(double s2Mark) {
		this.s2Mark = s2Mark;
	}

	public double getS3Mark() {
		return s3Mark;
	}

	public void setS3Mark(double s3Mark) {
		this.s3Mark = s3Mark;
	}

	public double getS4Mark() {
		return s4Mark;
	}

	public void setS4Mark(double s4Mark) {
		this.s4Mark = s4Mark;
	}

	public double getS5Mark() {
		return s5Mark;
	}

	public void setS5Mark(double s5Mark) {
		this.s5Mark = s5Mark;
	}

	public double getS6Mark() {
		return s6Mark;
	}

	public void setS6Mark(double s6Mark) {
		this.s6Mark = s6Mark;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	
}
