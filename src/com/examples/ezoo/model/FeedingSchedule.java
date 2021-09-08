package com.examples.ezoo.model;

public class FeedingSchedule {
	
	
	private long scheduleID;

	private String recurrance; 
	private String food; 
	private String notes;
	
	
	FeedingSchedule(int id, String recurrance, String food, String notes){
		this.scheduleID = id;
		this.recurrance = recurrance;
		this.food = food;
		this.notes = notes;
	}
	
	
	public long getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(long scheduleID) {
		this.scheduleID = scheduleID;
	}
	public String getRecurrance() {
		return recurrance;
	}
	public void setRecurrance(String recurrance) {
		this.recurrance = recurrance;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	} 
	
	@Override
	public String toString() {
		return "FeedingSchedule [scheduleID=" + String.valueOf(scheduleID) + " recurrance="+recurrance+" food="+food+" notes="+notes+"]";
	}
	
}
