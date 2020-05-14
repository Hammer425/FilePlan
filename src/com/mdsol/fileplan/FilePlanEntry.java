package com.mdsol.fileplan;

public class FilePlanEntry {

	private String zone;
	private String section;
	private String artifact;
	private boolean study;
	private boolean country;
	private boolean site;
	
	public FilePlanEntry() {
		
	}
	
	public FilePlanEntry(String zone, String section, String artifact, boolean study, boolean country, boolean site) {
		this.zone = zone;
		this.section = section;
		this.artifact = artifact;
		this.study = study;
		this.country = country;
		this.site = site;
	}
	
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getArtifact() {
		return artifact;
	}
	public void setArtifact(String artifact) {
		this.artifact = artifact;
	}
	public boolean isStudy() {
		return study;
	}
	public void setStudy(boolean study) {
		this.study = study;
	}
	public boolean isCountry() {
		return country;
	}
	public void setCountry(boolean country) {
		this.country = country;
	}
	public boolean isSite() {
		return site;
	}
	public void setSite(boolean site) {
		this.site = site;
	}

	@Override
	public String toString() {
		return "FilePlanEntry [zone=" + zone + ", section=" + section + ", artifact=" + artifact + ", study=" + study
				+ ", country=" + country + ", site=" + site + "]";
	}
	
	
}
