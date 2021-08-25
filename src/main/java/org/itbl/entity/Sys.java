package org.itbl.entity;

public class Sys {

	private String country;
	private Integer sunrise;
	private Integer sunset;
	public Sys() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sys(String country, Integer sunrise, Integer sunset) {
		super();
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getSunrise() {
		return sunrise;
	}
	public void setSunrise(Integer sunrise) {
		this.sunrise = sunrise;
	}
	public Integer getSunset() {
		return sunset;
	}
	public void setSunset(Integer sunset) {
		this.sunset = sunset;
	}
	@Override
	public String toString() {
		return "Sys [country=" + country + ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
	}
	
	
}
