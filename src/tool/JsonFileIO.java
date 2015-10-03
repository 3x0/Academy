package tool;

import base.Course;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;





/**
 * @author Echo
 */

public class JsonFileIO implements FileReadWriter {
  
  public void fileWriter(Course curse, String fileName, String fileFormat)
      throws FileNotFoundException, UnsupportedEncodingException {

    // Gson gson = new GsonBuilder().setPrettyPrinting().create();
    Gson gson = new GsonBuilder().create();
    String json = gson.toJson(curse);

    FileOutputStream fileOutputStream = new FileOutputStream(fileName);
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream,
        "UTF-8"));

    try {
      bufferedWriter.append(json);
      bufferedWriter.flush();
    } catch (IOException ex) {
      // handle exception
    } finally { // закрытие ресурсов обязательно в finally
      // Оба вызова обязательно в отдельных try-catch
      try {
        bufferedWriter.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }

      try {
        fileOutputStream.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }

  public Course fileReader(String fileName, String fileFormat) throws IOException {

    try (BufferedReader myfile = new BufferedReader(new FileReader(fileName));) {
      String jsonRead = (myfile.readLine());

      Gson gnon = new Gson();

      Course course = gnon.fromJson(jsonRead, Course.class);
      return course;
    }
  }
}
