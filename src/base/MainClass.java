package base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.zip.DataFormatException;

import myformate.MyFormat;
import resorses.ConsolReader;
import resorses.CourseCreator;
import tool.FileReadWriter;
import tool.FileIO;
import tool.ServiceM;

/**
 * Main class used for start work with project
 * 
 * @author Echo
 */

public class MainClass {
  /**
   * Main method used for start work with project
   * 
   * @param args
   *          standard
   */
  public static void main(String[] args) throws IOException, DataFormatException {
    // Add courses and users into academy
    Course courseOne = CourseCreator.javaCoreBuild();
    Course courseTwo = CourseCreator.javaCore1Build();
    List<Course> courseList = new ArrayList<Course>();
    courseList.add(courseOne);
    courseList.add(courseTwo);

    User ivan = new User("Ivan", 1001, 1);
    User stas = new User("Stas", 1005, 2);
    User kolya = new User("Kolya", 1051, 1);
    User poma = new User("Poma", 1351, 5);
    List<User> usersList = new ArrayList<User>();
    usersList.add(poma);
    usersList.add(ivan);
    usersList.add(stas);
    usersList.add(kolya);

    Academy testAcademy = new Academy(courseList, usersList);

    FileReadWriter fileIO = new FileIO();

    // Serialize Course by JSON to String
    fileIO.fileWriter(courseOne, "json.txt", "json");

    // UnSerialize Course from String by JSON
    Course courseBack = fileIO.fileReader("json.txt", "json");

    System.out.println("=========Before JSON Serializer=========");
    System.out.println(courseOne.toString());
    System.out.println("=========After JSON Serializer==========");
    System.out.println(courseBack.toString());
    System.out.println();
    System.out.println("==============   XML  ==================");

    // Serialize Course by JAXB to XML file
    fileIO.fileWriter(courseOne, "jaxb.xml", "xml");
    // UnSerialize Course from XML file by JAXB
    Course courseUnMarsh = fileIO.fileReader("jaxb.xml", "xml");

    System.out.println();
    System.out.println("=======Before JAXB Serializer==========");
    System.out.println(courseOne.toString());
    System.out.println("=======After JAXB Serializer===========");
    System.out.println(courseUnMarsh.toString());
    
    System.out.println(testAcademy.toString());
    
//  Test marshal/unmarshal to/from MyFormate NOT COMLITE YET
  String test = MyFormat.marshalMyFormat(courseOne);
  System.out.println(test);
  try {
    MyFormat.unmarshalMyFormat(new CourseCreator().testCourse);
  } catch (DataFormatException e) {
    e.printStackTrace();
  }
    
//Test ConsolReader
//    Course consoleReadeCourse = ConsolReader.readConsol();
//    System.out.println(consoleReadeCourse.toString());
    
    //test service method find unhiden test in Academy
    System.out.println(ServiceM.findUnHidenTest(testAcademy));
    
    //test service method find Courses that start within a week of setting the date 
    Calendar today = new GregorianCalendar();
    today.set(2015, 8, 27);
    System.out.println(ServiceM.findCoursesByDate(testAcademy, today));
  }

}
