package com.mdsol.fileplan.response.model;

public class Study {
	
	private Zone zone;
	

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	@Override
	public String toString() {
		return "Study [zone=" + zone + "]";
	}
	

}
