package Lession2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Creation of Hiber01.
 * <p/>
 * Created by cdong
 * Created date 8/2/17 3:00 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
@Entity
@Table(name="emp1000")
public class Employee {
  @Id
  private int id;
  private String firstName;
  private String lastName;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
