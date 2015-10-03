package tool;

import base.Course;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;



public class FileIO implements FileReadWriter {

  @Override
  public void fileWriter(Course course, String fileName, String fileFormat)
      throws FileNotFoundException, UnsupportedEncodingException {
    if (fileFormat.equals("json")) {
      new JsonFileIO().fileWriter(course, fileName, fileFormat);
    }
    if (fileFormat.equals("xml")) {
      new JaxbFileIO().fileWriter(course, fileName, fileFormat);
    }
  }

  @Override
  public Course fileReader(String fileName, String fileFormat) throws IOException {
    Course course = null;
    if (fileFormat.equals("json")) {
      course = new JsonFileIO().fileReader(fileName, fileFormat);
    }
    if (fileFormat.equals("xml")) {
      course = new JaxbFileIO().fileReader(fileName, fileFormat);
    }
    return course;
  }
}
