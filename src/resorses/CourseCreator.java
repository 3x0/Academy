package resorses;

import base.Course;
import base.Modul;
import base.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;


/**
 * CourseCreator
 * class for test courses store
 * 
 * @author Echo
 */

public class CourseCreator {
  
  public static String testCourse = "{/Java Core-01:09:2015:10:00-30:01:2016:23:59/"
      + "/ProcedureJava-01:09:2015:10:00-30:09:2015:23:59/"
      + "/JavaIO-01:10:2015:10:00-31:10:2015:23:59/"
      + "/Exception-01:11:2015:10:00-30:11:2015:23:59/"
      + "/Collections-01:12:2015:10:00-31:12:2015:23:59/"
      + "/OOP-01:01:2016:10:00-30:01:2016:23:59/}";
  

/**
 * Method creates a new course and set its fields
 * 
 * @return instance of Course
 */
  public static Course javaCoreBuild() {
    List<Modul> javaCoreModulList = new ArrayList<Modul>();
    
    javaCoreModulList.add(new Modul("ProcedureJava", 
        new GregorianCalendar(2015, Calendar.SEPTEMBER, 1, 10, 0, 0),
        new GregorianCalendar(2015, Calendar.SEPTEMBER, 30, 23, 59, 59),
        true, new Test("ProcedurJavaQuiz",
            new GregorianCalendar(2015, Calendar.SEPTEMBER, 30, 20, 59, 59),
            new GregorianCalendar(2015, Calendar.SEPTEMBER, 30, 23, 59, 59),10,false)));
    
    javaCoreModulList.add(new Modul("JavaIO",
        new GregorianCalendar(2015, Calendar.OCTOBER, 1, 10, 0, 0),
        new GregorianCalendar(2015, Calendar.OCTOBER, 31, 23, 59, 59),
        false,new Test("JavaIOQuiz",
            new GregorianCalendar(2015, Calendar.OCTOBER, 31, 20, 59, 59),
            new GregorianCalendar(2015, Calendar.OCTOBER, 31, 23, 59, 59),15,true)));
    
    javaCoreModulList.add(new Modul("Exception",
        new GregorianCalendar(2015, Calendar.NOVEMBER, 1, 10, 0, 0),
        new GregorianCalendar(2015, Calendar.NOVEMBER, 30, 23, 59, 59),
        true, new Test("ExceptionQuiz",
            new GregorianCalendar(2015, Calendar.NOVEMBER, 30, 20, 59, 59),
            new GregorianCalendar(2015, Calendar.NOVEMBER, 30, 23, 59, 59), 10,true)));
    
    javaCoreModulList.add(new Modul("Collections",
        new GregorianCalendar(2015, Calendar.DECEMBER, 1, 10, 0, 0),
        new GregorianCalendar(2015, Calendar.DECEMBER, 31, 23, 59, 59),
        true, new Test("CollectionsQuiz",
            new GregorianCalendar(2015, Calendar.DECEMBER, 31, 20, 59, 59),
            new GregorianCalendar(2015, Calendar.DECEMBER, 31, 23, 59, 59), 20,false)));
    
    javaCoreModulList.add(new Modul("OOP",
        new GregorianCalendar(2016, Calendar.JANUARY, 1, 10, 0, 0),
        new GregorianCalendar(2016, Calendar.JANUARY, 30, 23, 59, 59),
        true,new Test("OOPQuiz",
            new GregorianCalendar(2016, Calendar.JANUARY, 30, 20, 59, 59),
            new GregorianCalendar(2016, Calendar.JANUARY, 30, 23, 59, 59),
            20,true)));
    
    Course javaCore = new Course("Java Core", 
        new GregorianCalendar(2015, Calendar.SEPTEMBER, 1, 10, 0, 0),
        new GregorianCalendar(2016, Calendar.JANUARY, 30, 23, 59, 59),
        javaCoreModulList);
    
    return javaCore;
  }
  /**
   * Method creates a new course and set its fields
   * 
   * @return instance of Course
   */
  public static Course javaCore1Build() {
    List<Modul> javaCoreModulList = new ArrayList<Modul>();
    
    javaCoreModulList.add(new Modul("ProcedureJava", 
        new GregorianCalendar(2015, Calendar.SEPTEMBER, 1, 10, 0, 0),
        new GregorianCalendar(2015, Calendar.SEPTEMBER, 30, 23, 59, 59),
        true, new Test("ProcedurJavaQuiz",
            new GregorianCalendar(2015, Calendar.SEPTEMBER, 30, 20, 59, 59),
            new GregorianCalendar(2015, Calendar.SEPTEMBER, 30, 23, 59, 59),10,false)));
    
    javaCoreModulList.add(new Modul("JavaIO",
        new GregorianCalendar(2015, Calendar.OCTOBER, 1, 10, 0, 0),
        new GregorianCalendar(2015, Calendar.OCTOBER, 31, 23, 59, 59),
        false,new Test("JavaIOQuiz",
            new GregorianCalendar(2015, Calendar.OCTOBER, 31, 20, 59, 59),
            new GregorianCalendar(2015, Calendar.OCTOBER, 31, 23, 59, 59),15,true)));
    
    javaCoreModulList.add(new Modul("Exception",
        new GregorianCalendar(2015, Calendar.NOVEMBER, 1, 10, 0, 0),
        new GregorianCalendar(2015, Calendar.NOVEMBER, 30, 23, 59, 59),
        true, new Test("ExceptionQuiz",
            new GregorianCalendar(2015, Calendar.NOVEMBER, 30, 20, 59, 59),
            new GregorianCalendar(2015, Calendar.NOVEMBER, 30, 23, 59, 59), 10,false)));
    
    javaCoreModulList.add(new Modul("Collections",
        new GregorianCalendar(2015, Calendar.DECEMBER, 1, 10, 0, 0),
        new GregorianCalendar(2015, Calendar.DECEMBER, 31, 23, 59, 59),
        true, new Test("CollectionsQuiz",
            new GregorianCalendar(2015, Calendar.DECEMBER, 31, 20, 59, 59),
            new GregorianCalendar(2015, Calendar.DECEMBER, 31, 23, 59, 59), 20,false)));
    
    javaCoreModulList.add(new Modul("OOP",
        new GregorianCalendar(2016, Calendar.JANUARY, 1, 10, 0, 0),
        new GregorianCalendar(2016, Calendar.JANUARY, 30, 23, 59, 59),
        true,new Test("OOPQuiz",
            new GregorianCalendar(2016, Calendar.JANUARY, 30, 20, 59, 59),
            new GregorianCalendar(2016, Calendar.JANUARY, 30, 23, 59, 59),
            20,true)));
    
    Course javaCore = new Course("Java Core2", 
        new GregorianCalendar(2015, Calendar.SEPTEMBER, 1, 10, 0, 0),
        new GregorianCalendar(2016, Calendar.JANUARY, 30, 23, 59, 59),
        javaCoreModulList);
    
    return javaCore;
  }
  
 }
