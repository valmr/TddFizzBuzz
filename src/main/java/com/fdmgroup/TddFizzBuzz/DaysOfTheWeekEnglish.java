package com.fdmgroup.TddFizzBuzz;




/**
 * @deprecated Enums - they might add Trumpday
 * @version  1.9
 * @since 2019
 *  I can explain how or why the code works,
 *  perhaps some sort of example of what you would 
 *  
 */
public enum DaysOfTheWeekEnglish {
	
	Monday("Monday", 1),
	Tuesday("Tuesday", 2),
	Wednesday("Wednesday", 3),
	Thursday("Thursday", 4),
	Friday("Friday", 5),
	Saturday("Saturday", 6),
	Sunday("Sunday", 7);
	
	private String nameOfDay;
	private int numberOfDay;
	
	private DaysOfTheWeekEnglish(String day, int dayNumber) {
		this.nameOfDay = day;
		this.numberOfDay = dayNumber;
	}
	
	/**
	 * This method returns the string literal of the 
	 * enum of the day of the week
	 * @return a String of the name of the Day
	 */
	public String getNameOfDay(){
		return nameOfDay;
	}
	
	public int getNumberOfDay() {
		return numberOfDay;
	}
	
	
	
}
