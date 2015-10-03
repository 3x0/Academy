package tool;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import base.Course;

/**
 * @author Echo
 */

public interface FileReadWriter {
  public void fileWriter(Course course, String fileName, String fileFormat)
      throws FileNotFoundException, UnsupportedEncodingException;

  public Course fileReader(String fileName, String fileFormat) throws IOException;
}
