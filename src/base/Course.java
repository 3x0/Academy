package base;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * Creates instance of Course extends Base
 * 
 * @author Echo
 * @param modules
 *          list of modules inside this course
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Course extends Base {
  private static final long serialVersionUID = 1L;
  private List<Modul> modules = new ArrayList<>();

  public Course() {
  }

  public Course(String courseName, Calendar startTime, Calendar endTime, List<Modul> modules) {
    super(courseName, startTime, endTime);
    this.modules = modules;
  }

  public List<Modul> getModules() {
    return modules;
  }

  // @XmlElementWrapper
  public void setModules(Collection<Modul> modules) {
    this.modules = (List<Modul>) modules;
  }

  @Override
  public String toString() {
    return "[Course //" + super.getTitle() + "//" + modules + "]";
  }

}
