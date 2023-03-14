package se.kth.jsonlibs;

import org.json.JSONObject;
import se.kth.entities.Dog;

public class OrgJsonMain {
  public static void main(String[] args) {
    System.out.println("===== ORG-JSON =====");
    Dog dog = new Dog("Kaaju", "Labrador Retriever", "yellow", 7);
    JSONObject jsonObject = new JSONObject(dog);
    System.out.println(jsonObject.toString(2));
  }
}
