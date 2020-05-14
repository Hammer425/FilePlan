package com.mdsol.fileplan.response.model;


public class FilePlan {
	
	private Study study;
	private Country country;
	private Site site;
	
	
	public Study getStudy() {
		return study;
	}
	public void setStudy(Study study) {
		this.study = study;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	@Override
	public String toString() {
		return "FilePlan [study=" + study + ", country=" + country + ", site=" + site + "]";
	}
	
	

}
