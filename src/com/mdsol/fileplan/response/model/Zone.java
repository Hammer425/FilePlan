package com.mdsol.fileplan.response.model;

import java.util.List;

public class Zone {
	
	private String zone;
	private List<Section> section;
	
	
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public List<Section> getSection() {
		return section;
	}
	public void setSection(List<Section> section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Zone [zone=" + zone + ", section=" + section + "]";
	}

}
