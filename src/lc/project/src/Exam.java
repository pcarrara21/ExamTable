/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lc.project.src;


import java.awt.Color;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Hiraishin
 */
public class Exam {
    String name,day,hour,color;
    LocalDateTime time;              //time-constructor is the method time.of
    
    public Exam(String name, String day, String hour, String color) {
            this.name = name;
            this.day = day;
            time = LocalTime.parse(hour, DateTimeFormatter.ofPattern("HH.mm")).atDate(LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yy")));
            this.color = color;         //don't blame me they're all static methods ^^^			
            this.hour = hour;
    }
    
    
    	
    public void setTime(LocalDateTime time){
        this.time = time;
    }
		
    public String dateToString() {			
        return this.time.getDayOfMonth() + "/" + this.time.getMonthValue() + "/" + this.time.getYear() ;
    }
		
        public String getName() {
                return name;
        }

        public String getDay() {
                return day;
        }
		
        public LocalDateTime getTime() {
                    return time;
         }
        
        public String getHour()
        {
            return hour;
        }
       
        
        public Color getColor()
        {
          
            
            Color c;
            try {
                Field field = Class.forName("java.awt.Color").getField(this.color);
                c = (Color)field.get(null);
            } catch (Exception e) {
                c = null; // Not defined
            }
            
	    return c;	//assumes there are no duplicates
            
        }
}
