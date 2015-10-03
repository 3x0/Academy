package validators;

public interface ValidPaterns {
  String TITLEVLIDPATERN = "^[A-Z]{1}([a-zA-Z0-9\\s]){1,10}$";
  String TESTAVALIBLEPATERN = "^Yes|No$";
  String DATEVALIDPATERN = "(0[1-9]|[1][0-9]|3[01])[-\\.\\:](0[1-9]|1[012])"
      + "[-\\.\\:](19|20)\\d\\d[-\\.\\:]([01][0-9]|2[0-4])[-\\.\\:]([0-5][0-9])";
  String QUESTIONSNUMBPATERN = "^([1-9]|[1-9][0-9])$";

}
