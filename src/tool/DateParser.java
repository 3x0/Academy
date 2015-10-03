package tool;

import validators.ValidPaterns;
import validators.Validator;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.zip.DataFormatException;




/**
 * class for parse and validate parsing date
 * 
 * @author Echo
 */
public class DateParser {
  static boolean valid;

  /**
   * creates a new instance of the date from transmitted string
   * 
   * @param date
   *          parsing string of date field
   *
   */
  public static Calendar pars(String date) throws DataFormatException {
    valid = Validator.validate(date, ValidPaterns.DATEVALIDPATERN);
    if (valid) {
      // System.out.println(valid);
      String delims = "-|\\.|\\:";
      String[] tokensEd = date.split(delims);
      Calendar resultDate = dateReader(tokensEd);
      return resultDate;
    } else {
      throw new DataFormatException();
    }
  }

  private static Calendar dateReader(String[] date) {
    Calendar resultDate = new GregorianCalendar();
    int dated = Integer.parseInt(date[0]);
    int month = Integer.parseInt(date[1]);
    int year = Integer.parseInt(date[2]);
    int hour = Integer.parseInt(date[3]);
    int minute = Integer.parseInt(date[4]);
    System.out.println(dated + month + year + hour + minute);
    resultDate.set(dated, month, year, hour, minute);
    return resultDate;
  }
}
