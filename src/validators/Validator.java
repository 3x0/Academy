package validators;

import base.Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {
// TODO not ready yet
  
//  public static Test validate(Test test) {
//    Scanner in = new Scanner(System.in);
//    String str = in.nextLine();
//    String delims = "[ ]+";
//    String[] tokens = str.split(delims);
//    for (int i = 0; i < tokens.length; i++) {
//      if (tokens[0].equalsIgnoreCase("title")) {
//      }
//    }
//    System.out.println(tokens[0]);
//    return null;
//  }

  public static boolean validate(String field, String patern) {
    Pattern p = Pattern.compile(patern);
    Matcher m = p.matcher(field);
    return m.matches();
  }

}
