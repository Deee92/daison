package se.kth.jsonlibs;

import org.json.simple.JSONObject;
import se.kth.entities.Dog;

import java.util.LinkedHashMap;
import java.util.Map;

public class JsonSimpleMain {
  public static void main(String[] args) {
    System.out.println("===== JSON-SIMPLE =====");
    Dog dog = new Dog("Kaaju", "Labrador Retriever", "yellow", 7);
    Map<String, Object> dogMap = new LinkedHashMap<>();
    dogMap.put("colour", dog.getColour());
    dogMap.put("name", dog.getBreed());
    dogMap.put("breed", dog.getBreed());
    dogMap.put("age", dog.getAge());
    JSONObject jsonObject = new JSONObject(dogMap);
    System.out.println(jsonObject.toJSONString());
  }
}
