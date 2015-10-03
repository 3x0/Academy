package resorses;

import base.Course;
import base.Modul;
import tool.DateParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

import validators.Validator;
import validators.ValidPaterns;

/**
 * Read input date from console
 * 
 * @author Echo
 */
public class ConsolReader {
  /**
   * Creates instance of Course from console input date
   * 
   * @author Echo
   * 
   * @throws IOException
   *           exception while reading the title
   * @throws DataFormatException
   *           exception while reading the startTime, endTime.
   */
  public static Course readConsol() throws DataFormatException, IOException {
    Course readCourse = new Course();
    Scanner in = new Scanner(System.in);
    boolean valid = false;

    System.out.println("Input course Title.");
    System.out.println("With a capital letter, using letters,numbers and _.");
    String title = in.nextLine();
    valid = Validator.validate(title, ValidPaterns.TITLEVLIDPATERN);
    if (valid) {
      readCourse.setTitle(title);
    } else {
      in.close();
      throw new IOException();
    }

    System.out.println("Input course startDate in formate dd-mm-yyyy-hh-mm. as delims yu can use[.-:]");
    String startTime = in.nextLine();
    Calendar startDate = DateParser.pars(startTime);
    readCourse.setStartTime(startDate);

    System.out.println("Input course endDate in formate mm-dd-yyyy-hh-mm. as delims yu can use[.-:]");
    String endTime = in.nextLine();
    Calendar endtDate = DateParser.pars(endTime);
    readCourse.setEndTime(endtDate);

    System.out.println("хотите добавить модуль в существующий курс");
    
    System.out.println("Input module Title.");
    System.out.println("With a capital letter, using letters,numbers and _.");
    String moduleTitle = in.nextLine();
    valid = Validator.validate(moduleTitle, ValidPaterns.TITLEVLIDPATERN);
    if (valid) {
      List<Modul> modules = new ArrayList<>();
      Modul modul1 = new Modul();
      modul1.setTitle(moduleTitle);
      readCourse.setModules(modules);
      modules.add(modul1);
      
      System.out.println("Input module startDate in formate dd-mm-yyyy-hh-mm. as delims yu can use[.-:]");
      String startTimeM = in.nextLine();
      Calendar startDateM = DateParser.pars(startTimeM);
      modul1.setStartTime(startDateM);

      System.out.println("Input module endDate in formate mm-dd-yyyy-hh-mm. as delims yu can use[.-:]");
      String endTimeM = in.nextLine();
      Calendar endtDateM = DateParser.pars(endTimeM);
      modul1.setEndTime(endtDateM);
      
      System.out.println("This module include the test  Yes/No ?");
      String testInclude = in.nextLine();
      valid = Validator.validate(testInclude, ValidPaterns.TESTAVALIBLEPATERN);
      if (valid) {
        if(testInclude.equals("yes")){
          modul1.setTestInclude(true);
        }
        if(testInclude.equals("No")){
          modul1.setTestInclude(false);
        }
      }
    } else {
      in.close();
      throw new IOException();
    }

    in.close();
    return readCourse;
  }
}
