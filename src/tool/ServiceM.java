package tool;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import base.Academy;
import base.Course;
import base.Modul;
import base.Test;

public class ServiceM {
  public static String searchResult;
  /**
   * find tests that marked like unhide
   * 
   * @param serchacademy
   *          Academy in which is found unhide tests
   
   * @return String list of unhide test in Academy
   */
  public static String findUnHidenTest(Academy serchacademy) {
    searchResult = "";
    List<Course> allCourses = serchacademy.getCourses();
    for (Course course : allCourses) {
      List<Modul> corseModuls = course.getModules();
      for (Modul modul : corseModuls) {
        Test modulTest = modul.getTest();
        if (!modulTest.getHide()) {
          searchResult = searchResult + "[course-" + course.getTitle() + ": mudule-"
              + modul.getTitle() + ": test-" + modulTest.getTitle() + "]";
        }
      }
    }
    return searchResult;
  }

  /**
   * find Courses that start within a week of setting the date
   * 
   * @param serchacademy
   *          Academy in which is found available in a week courses by setting the dates
   * @param date
   *          setting the dates
   * @return String list of  available in a week courses
   */

  public static String findCoursesByDate(Academy serchacademy, Calendar date) {
    searchResult = "";
    List<Course> allCourses = serchacademy.getCourses();
    for (Course course : allCourses) {
      if ((course.getStartTime().getWeeksInWeekYear() - date.getWeeksInWeekYear()) < 1) {
        searchResult = searchResult + "[ " + course.getTitle() + " ]";
      }
    }
    return searchResult;
  }
}
