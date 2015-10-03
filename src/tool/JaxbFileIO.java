package tool;

import base.Course;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;



/**
 * @author Echo
 */

public class JaxbFileIO implements FileReadWriter {
  
  public void fileWriter(Course course, String fileName, String fileFormat) {

    try {
      File file = new File(fileName);
      JAXBContext jaxbContext = JAXBContext.newInstance(Course.class);
      Marshaller courseMarshaller = jaxbContext.createMarshaller();

      // форматированный вывод
      courseMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

      courseMarshaller.marshal(course, file);
      // флудим в систем как мы трудимся
      courseMarshaller.marshal(course, System.out);
    } catch (Exception ex) {
      System.out.println(ex.getLocalizedMessage());
      ex.printStackTrace();
    }
  }

  public Course fileReader(String filename, String fileFormat) {

    Course courseUnMarsh = null;
    try {
      File file = new File(filename);
      JAXBContext jaxbContext = JAXBContext.newInstance(Course.class);

      Unmarshaller courseUnmarshaller = jaxbContext.createUnmarshaller();
      courseUnMarsh = (Course) courseUnmarshaller.unmarshal(file);

    } catch (JAXBException jaxbe) {
      System.out.println(jaxbe.getLocalizedMessage());
      jaxbe.printStackTrace();
    }
    return (Course) courseUnMarsh;
  }
}
