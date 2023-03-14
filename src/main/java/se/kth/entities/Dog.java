package se.kth.entities;

public class Dog {
  String name;
  String breed;
  String colour;
  int age;

  public Dog(String name, String breed, String colour, int age) {
    this.name = name;
    this.breed = breed;
    this.colour = colour;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
