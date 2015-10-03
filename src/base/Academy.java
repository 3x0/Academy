package base;

import java.util.ArrayList;
import java.util.List;

public class Academy {
  private List<Course> courses = new ArrayList<Course>();
  private List<User> users = new ArrayList<User>();
  /**
   * Academy constructor
   */
  public Academy(List<Course> courses, List<User> users) {
    super();
    this.courses = courses;
    this.users = users;
  }

  public List<Course> getCourses() {
    return courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }

  @Override
  public String toString() {
    return "Academy [courses=" + courses + ", users=" + users + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((courses == null) ? 0 : courses.hashCode());
    result = prime * result + ((users == null) ? 0 : users.hashCode());
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
    Academy other = (Academy) obj;
    if (courses == null) {
      if (other.courses != null) {
        return false;
      }
    } else if (!courses.equals(other.courses)) {
      return false;
    }
    if (users == null) {
      if (other.users != null) {
        return false;
      }
    } else if (!users.equals(other.users)) {
      return false;
    }
    return true;
  }
  
}
