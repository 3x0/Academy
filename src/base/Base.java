package base;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.bind.annotation.*;

/**
 * Base class for Course and Modul
 * 
 * @author Echo
 */

// @XmlRootElement
@XmlType(propOrder = { "title", "startTime", "endTime" })
public class Base implements Serializable {

  protected static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy-HH:mm");
  private static final long serialVersionUID = 1L;
  private String title;
  Calendar startTime = new GregorianCalendar();
  Calendar endTime = new GregorianCalendar();

  public Base() {
  }

  /**
   * Base class constructor
   */
  public Base(String title, Calendar startTime, Calendar endTime) {
    this.title = title;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  @XmlElement
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @XmlElement(name = "Begin")
  public Calendar getStartTime() {
    return startTime;
  }

  public void setStartTime(Calendar startTime) {
    this.startTime = startTime;
  }

  @XmlElement(name = "Finish")
  public Calendar getEndTime() {
    return endTime;
  }

  public void setEndTime(Calendar endTime) {
    this.endTime = endTime;
  }

  @Override
  public String toString() {
    // return "courseName=" + title + ", startTime=//" +
    // startTime.getTime() + "//" + ", endTime=//" + endTime.getTime() + "//";

    return "courseName=" + title + ", startTime=//" + dateFormat.format(startTime.getTime()) + "//"
        + ", endTime=//" + dateFormat.format(endTime.getTime()) + "//";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Base other = (Base) obj;
    if (title == null) {
      if (other.title != null) {
        return false;
      }
    } else if (!title.equals(other.title)) {
      return false;
    }
    return true;
  }

}
