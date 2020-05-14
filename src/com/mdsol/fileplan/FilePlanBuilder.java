package com.mdsol.fileplan;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mdsol.fileplan.response.model.Artifact;
import com.mdsol.fileplan.response.model.Country;
import com.mdsol.fileplan.response.model.FilePlan;
import com.mdsol.fileplan.response.model.Section;
import com.mdsol.fileplan.response.model.Site;
import com.mdsol.fileplan.response.model.Study;
import com.mdsol.fileplan.response.model.Zone;



public class FilePlanBuilder {

	public List<FilePlanEntry> readFilePlan(String path) {

		List<FilePlanEntry> entries = new ArrayList<>();
		
		try (Stream<String> stream = Files.lines(Paths.get(path))) {
			
			stream.forEach(e -> {
				String[] entry = e.split(",");
				entries.add(new FilePlanEntry(entry[0], entry[1], entry[2], isSelected(entry[3]), isSelected(entry[4]), isSelected(entry[5])));
			});
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		return entries;
		
	}
	
	public void initializeTree(List<FilePlanEntry> entries) {
		// Objective initialize a file structure based on comma delimited entries in
		// a pseudo-DIA (Drug Information Association) file plan.
		//
		// Top folder "File Plan"
		// 3 sub folders Levels for Study, Country, and Site (X means that the Level
		// contains the artifact, and a 0 means it does not) as you can see the first
		// entry is created on all 3 levels, and the second entry is only created at
		// the Study and Site levels.
		//
		// Levels have variable amount of sub-folders for Zones
		// Zones have variable amount of sub-folders for Section
		// Sections contain the 0 byte files which are Artifacts
		
		List<FilePlan>  fileList = creatingFilesPlan(entries);
		System.out.println(fileList);
		
	}

	private List<FilePlan> creatingFilesPlan(List<FilePlanEntry> entries) {

		List<FilePlan> fileList = new ArrayList<>();
		entries.stream().forEach(input -> {
			FilePlan filePlan = new FilePlan();
			Study study = new Study();
			Country country = new Country();
			Site site = new Site();
			if (input.isStudy()) {
				Zone zone = createFilePlanForChildren(input);
				study.setZone(zone);
			}
			if (input.isCountry()) {
				Zone zone = createFilePlanForChildren(input);
				country.setZone(zone);
			}
			if (input.isSite()) {
				Zone zone = createFilePlanForChildren(input);
				site.setZone(zone);
			}
			filePlan.setStudy(study);
			filePlan.setCountry(country);
			filePlan.setSite(site);
			fileList.add(filePlan);
		});
		return fileList;
	}

	private Zone createFilePlanForChildren(FilePlanEntry input) {
		Zone zone = new Zone();
		Section section = new Section();
		Artifact artifact = new Artifact();

		List<Artifact> listOfArtifact = new ArrayList<>();
		List<Section> sectionList = new ArrayList<>();

		artifact.setArtifact(input.getArtifact());
		listOfArtifact.add(artifact);

		section.setSection(input.getSection());
		section.setArtifact(listOfArtifact);
		sectionList.add(section);

		zone.setZone(input.getZone());
		zone.setSection(sectionList);
		return zone;
	}
	

	public static boolean isSelected(String x) {
		if (x.equals("X")) {
			return true;
		}
		return false;
	}
	
	
}
