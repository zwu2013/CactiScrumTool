package org.cacti.scrumtool.shared.dto;

import java.io.Serializable;

public class SprintDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1440122316228381684L;

	private Integer id;
	private String sprintDescription;
	
	// etc
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSprintDescription() {
		return sprintDescription;
	}
	public void setSprintDescription(String sprintDescription) {
		this.sprintDescription = sprintDescription;
	}
}
