package base;

/**
 * This class allows you to create a user and define its parameters
 * 
 * @author Echo
 */
public class User {
  private String name;
  private int id;
  private int accessMmodifier;

  public User() {
  }

  /**
   * Creates instance of User
   * 
   * @author Echo
   * @param name user name
   * @param id user id
   * @param accessMmodifier modifiers user access 
   */
  public User(String name, int id, int accessMmodifier) {
    super();
    this.name = name;
    this.id = id;
    this.accessMmodifier = accessMmodifier;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAccessMmodifier() {
    return accessMmodifier;
  }

  public void setAccessMmodifier(short accessMmodifier) {
    this.accessMmodifier = accessMmodifier;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
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
    User other = (User) obj;
    if (id != other.id) {
      return false;
    }
    if (name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!name.equals(other.name)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "User [name=" + name + ", id=" + id + ", accessMmodifier=" + accessMmodifier + "]";
  }

}
