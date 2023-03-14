package se.kth.jsonlibs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import se.kth.entities.Dog;

public class GsonMain {
  public static void main(String[] args) {
    System.out.println("===== GSON =====");
    Dog dog = new Dog("Kaaju", "Labrador Retriever", "yellow", 7);
    GsonBuilder gsonBuilder = new GsonBuilder().setPrettyPrinting();
    Gson gson = gsonBuilder.create();
    System.out.println(gson.toJson(dog));
  }
}
