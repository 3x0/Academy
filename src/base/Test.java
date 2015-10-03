package base;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Creates instance of Test extends Base
 * 
 * @author Echo
 * @param modules
 *          list of modules inside this course
 * @return instance of Test
 */

@XmlRootElement
@XmlType(propOrder = { "numbersOfQuetions" ,"hide"})
public class Test extends Base {

  private static final long serialVersionUID = 1L;
  // private String title;
  private int NumbersOfQuetions;
  private boolean hide;
 

  public Test() {
  }

  public Test(String title, Calendar StartTime, Calendar EndTime, int numbersOfQuetions,boolean hide) {
    super(title, StartTime, EndTime);
    NumbersOfQuetions = numbersOfQuetions;
    this.hide = hide;
  }

  public int getNumbersOfQuetions() {
    return NumbersOfQuetions;
  }

  public void setNumbersOfQuetions(int numbersOfQuetions) {
    NumbersOfQuetions = numbersOfQuetions;
  }
  
  public boolean getHide() {
    return hide;
  }

  public void setHide(boolean hide) {
    this.hide = hide;
  }

  @Override
  public String toString() {
    return " #Test=> " + this.getTitle() + ", NumbersOfQuetions=" + NumbersOfQuetions
        + ", Start at (" + dateFormat.format(this.getStartTime().getTime()) + ")" + ", End at ("
        + dateFormat.format(this.getEndTime().getTime()) + "), hide-" + this.getHide() + "# ]";
  }

}
