package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the offices database table.
 * 
 */
@Entity
@Table(name="offices")
@NamedQuery(name="Office.findAll", query="SELECT o FROM Office o")
public class Office implements Serializable {
	@Override
	public String toString() {
		return "Office [officeCode=" + officeCode + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", city=" + city + ", country=" + country + ", phone=" + phone + ", postalCode=" + postalCode
				+ ", state=" + state + ", territory=" + territory + "]";
	}

	private static final long serialVersionUID = 1L;

	@Id
	private String officeCode;

	private String addressLine1;

	private String addressLine2;

	private String city;

	private String country;

	private String phone;

	private String postalCode;

	private String state;

	private String territory;

	public Office() {
	}

	public String getOfficeCode() {
		return this.officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTerritory() {
		return this.territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

}