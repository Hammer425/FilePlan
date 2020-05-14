package com.mdsol.fileplan;

import java.util.List;

public class FilePlanNode {

	private FilePlanNode parent;
	private List<FilePlanNode> children;
	private String name;
	private boolean file;
	
	public FilePlanNode() {
		
	}
	
	public FilePlanNode(FilePlanNode parent, List<FilePlanNode> children, String name, boolean file) {
		this.parent = parent;
		this.children = children;
		this.name = name;
		this.file = file;
	}

	public FilePlanNode getParent() {
		return parent;
	}
	public void setParent(FilePlanNode parent) {
		this.parent = parent;
	}
	public List<FilePlanNode> getChildren() {
		return children;
	}
	public void setChildren(List<FilePlanNode> children) {
		this.children = children;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFile() {
		return file;
	}
	public void setFile(boolean file) {
		this.file = file;
	}
}
