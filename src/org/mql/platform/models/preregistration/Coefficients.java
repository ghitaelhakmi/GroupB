package org.mql.platform.models.preregistration;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType (XmlAccessType.FIELD)
public class Coefficients {
	@XmlElement(name="candidate")
	private List<Coefficient> coefficients;

	public Coefficients() {

	}

	public Coefficients(List<Coefficient> coefficients) {
		this.coefficients = coefficients;
	}

	public List<Coefficient> getCoefficients() {
		return coefficients;
	}

	public void setCoefficients(List<Coefficient> coefficients) {
		this.coefficients = coefficients;
	}
	
}
