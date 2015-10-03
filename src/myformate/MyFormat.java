package myformate;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.zip.DataFormatException;
import validators.ValidPaterns;
import base.Course;
import base.Modul;

/**
 * Creates instance of MyFormat
 * 
 * @author Echo
 */

public class MyFormat {
  protected static SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:yyyy:HH:mm");
  protected String[] moduls;
  private static String result = "";

  /**
   * Create string information about course in my format order
   *
   * @param cours
   *          the object to be converted to a string
   * @return coursFormat object as a string of my format
   */
  public static String marshalMyFormat(Course cours) {
    String coursFormat = "{/" + cours.getTitle() + "-"
        + dateFormat.format(cours.getStartTime().getTime()) + "-"
        + dateFormat.format(cours.getEndTime().getTime()) + "/" + parsModul(cours.getModules())
        + "}";

    // System.out.println(coursFormat);
    return coursFormat;
  }

  /**
   * Create string in my format order from list of modules in format (title-startDate-endDate)
   *
   * @param moduls
   *          massive of modules inside course
   * 
   * @return result information about all modules inside course in String format
   */

  private static String parsModul(List<Modul> moduls) {
    for (Modul mod : moduls) {
      result = result + "/" + mod.getTitle() + "-"
          + dateFormat.format(mod.getStartTime().getTime()) + "-"
          + dateFormat.format(mod.getEndTime().getTime()) + "/";
    }
    return result;
  }

  // Разбиваем строку на масив курс и модули
  /**
   * Create string massive of modules in my format order from Course in string format
   *
   * @param str
   *          Course in string MyFormat massive of modules inside course
   * 
   * @return tokensCourse string massive of Course and inside Modules in MyFormat string order
   */
  public static String[] coursTokenizer(String str) {
    String delims = "/{1,2}";
    String[] tokensCourse = str.split(delims);
    // test флудит в консоль разбитыми модулями
    for (String tok : tokensCourse) {
//      System.out.println(tok.toString());
    }
    return tokensCourse;
  }

  // разбавает строку модуля и курса на тилу и дату
  /**
   * Create string massive of modules field in my format order from Module in string format
   *                                 
   * @param str
   *          module in string MyFormat
   * 
   * @return tokensModul string massive of modules field in MyFormat string order
   */
  public static String[] modulTokenizer(String str) {
    String delimss = "-";
    String[] tokensModul = str.split(delimss);

    return tokensModul;
  }

  /**
   * Create Course instance from string in my format order.
   * Validate field title, startTime, endTime. 
   * 
   *               !!!!  NOT COMLITE YET   !!!! 
   *
   * @param marshaleCourse
   *          the object to be converted to a string
   * @return Course instance
   * @throws IOException exception while reading the title
   * @throws DataFormatException exception while reading the startTime, endTime.
   */
  public static Course unmarshalMyFormat(String marshaleCourse) throws IOException,
      DataFormatException {
    Course readCours = new Course();
    // Validate end set Course Title;
    String title = "" + modulTokenizer(coursTokenizer(marshaleCourse)[1])[0];
//    System.out.println(title);
    if (validators.Validator.validate(title, ValidPaterns.TITLEVLIDPATERN)) {
      readCours.setTitle(title);
    } else {
      System.out.println("bed Title!!!");
      throw new IOException();
    }
    // Validate end set Course startDate
    String startDate = "" + modulTokenizer(coursTokenizer(marshaleCourse)[1])[1];
//    System.out.println(startDate);
    readCours.setStartTime(tool.DateParser.pars(startDate));
    // Validate end set Course endDate
    String endDate = "" + modulTokenizer(coursTokenizer(marshaleCourse)[1])[2];
//    System.out.println(endDate);
    readCours.setStartTime(tool.DateParser.pars(endDate));
    // System.out.println(readCours.getEndTime());
    return readCours;

  }

}
