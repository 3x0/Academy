package base;

import java.util.Calendar;
import javax.xml.bind.annotation.*;

/**
 * class Modul extends Base
 * 
 * @author Echo
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "testInclude", "test" })
public class Modul extends Base {

  private static final long serialVersionUID = 1L;
  // private String title;
  private boolean testInclude;
  private Test test;

  public Modul() {
  }
  /**
   * Modul constructor
   * 
   * @author Echo
   * @param StartTime Modul start date and time
   * @param EndTime Modul end date and time
   * @param testInclude true if test include false if test absent
   * @param test         
   *
   */
  public Modul(String title, Calendar StartTime, Calendar EndTime, boolean testInclude, Test test) {
    super(title, StartTime, EndTime);
    this.testInclude = testInclude;
    this.test = test;
  }

  public Modul(String title, Calendar StartTime, Calendar EndTime, boolean testInclude) {
    super(title, StartTime, EndTime);
    this.testInclude = testInclude;
  }

  public boolean getTestInclude() {
    return testInclude;
  }

  public void setTestInclude(boolean testInclude) {
    this.testInclude = testInclude;
  }

  // TODO   надо подумать!!!
  public Test getTest() {
    return test;
  }

  @Override
  public String toString() {
    return "[Modul //" + this.getTitle() + "//, testInclude=" + testInclude + ", " + "Start at ("
        + dateFormat.format(this.getStartTime().getTime()) + ")" + ", End at ("
        + dateFormat.format(this.getEndTime().getTime()) + ")" + test.toString();
  }

}
