package com.mdsol.fileplan.response.model;

import java.util.List;

public class Section {
	
	private String section;
	private List<Artifact> artifact;
	
	
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public List<Artifact> getArtifact() {
		return artifact;
	}
	public void setArtifact(List<Artifact> artifact) {
		this.artifact = artifact;
	}
	@Override
	public String toString() {
		return "Section [section=" + section + ", artifact=" + artifact + "]";
	}
	
}
