package com.mdsol.fileplan;

import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		
		FilePlanBuilder builder = new FilePlanBuilder();

		//List<FilePlanEntry> entries = builder.readFilePlan("/Users/dstanley/projects/FilePlan/resources/allartifacts.csv");
		List<FilePlanEntry> entries = builder.readFilePlan("G:/FilePlan-master/FilePlan-master/resources/allartifacts.csv");
		builder.initializeTree(entries);
		
	}
}
