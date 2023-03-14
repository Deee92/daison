package se.kth.jsonlibs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import se.kth.entities.Dog;

/**
 * Daikon throws an exception with this
 */
public class JacksonMain {
  public static void main(String[] args) {
    System.out.println("===== JACKSON =====");
    Dog dog = new Dog("Kaaju", "Labrador Retriever", "yellow", 7);
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dog));
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
  }
}
