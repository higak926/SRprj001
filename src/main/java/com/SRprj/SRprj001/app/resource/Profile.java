package com.SRprj.SRprj001.app.resource;

public class Profile {

  /** 名前 */
  private String name;

  /** 年齢 */
  private int age;

  /** 挨拶 */
  private String greet;

  public Profile(String name, int age, String greet) {
	this.name = name;
	this.age = age;
	this.greet = greet;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public int getAge() {
	return age;
  }

  public void setAge(int age) {
	this.age = age;
  }

  public String getGreet() {
	return greet;
  }

  public void setGreet(String greet) {
	this.greet = greet;
  }

}
