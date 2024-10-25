package com.mvc.vo;

public class Movie {
	int id;
	int CinemaCode;
	String title;
	String releaseDate;
	int runningTime;
	
	String cinemaName;
	String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCinemaCode() {
		return CinemaCode;
	}
	public void setCinemaCode(int cinemaCode) {
		CinemaCode = cinemaCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Movie(int id, int cinemaCode, String title, String releaseDate, int runningTime, String cinemaName,
			String location) {
		super();
		this.id = id;
		CinemaCode = cinemaCode;
		this.title = title;
		this.releaseDate = releaseDate;
		this.runningTime = runningTime;
		this.cinemaName = cinemaName;
		this.location = location;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
