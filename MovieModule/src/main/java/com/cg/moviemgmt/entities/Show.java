package com.cg.moviemgmt.entities;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.*;
import org.springframework.data.annotation.Id;

@Entity
public class Show {
	
	@Id
	@GeneratedValue
	@Column(name="show_id")
	private int showId ;
	private Time showStartTime ;
	private Time showEndTime ;
	@ElementCollection
	private List<Integer> seatsId;
	private String showName ;
    private String movieName ;
    private int theaterId;
    private int screenId;
    
    
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public Time getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(Time showStartTime) {
		this.showStartTime = showStartTime;
	}
	public Time getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(Time showEndTime) {
		this.showEndTime = showEndTime;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	
	public List<Integer> getSeatsId() {
		return seatsId;
	}
	public void setSeatsId(List<Integer> seatsId) {
		this.seatsId = seatsId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	
    
      
      
}
