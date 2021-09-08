package com.examples.ezoo.dao;
import java.util.List;

import com.examples.ezoo.model.Animal;
import com.examples.ezoo.model.FeedingSchedule;

public interface FeedingScheduleDAO{
	
	
	/** 
	 * Method to add a given feeding schedule to the database.
	 * @Author: ARosenbaum
	 **/
	
	void addFeedingSchedule(FeedingSchedule schedule);
	void addFeedingSchedule(long scheduleID);
	
	/*
	 * Method to delete a given feeding schedule to the database. This 
	 * method should first remove all references to that feeding schedule 
	 * from the ANIMALS table.
	 * @Author: ARosenbaum
	 */
	
	void deleteFeedingSchedule(FeedingSchedule schedule);
	void deleteFeedingSchedule(long scheduleId);
	
	/*
	 * Method to retrieve all feeding schedules from the database
	 * @Author: ARosenbaum
	 */
	List<FeedingSchedule> getAllFeedingSchedules();
	
	
	/*
	 * Method to retrieve a single feeding schedule from the database for a 
	 * given animal
	 * @Author: ARosenbaum
	 */
	
	FeedingSchedule getFeedingSchedule(Animal animal);
	FeedingSchedule getFeedingSchedule(long animalId);

	/*
	 * Method to assign a given feeding schedule to a given animal.
	 * @Author: ARosenbaum
	 */

	void assignFeedingSchedule(FeedingSchedule schedule);
	void assignFeedingSchedule(long scheduleId);

	/*
	 * Method to remove a feeding schedule from a given animal.
	 * @Author: ARosenbaum
	 */
	
	void removeFeedingSchedule(Animal animal);
	void removeFeedingSchedule(long animalId);
	
}
