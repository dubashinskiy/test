import java.util.Arrays;
import java.util.List;

public class Utilities {
  public static String toCase(String str){

    List<String> subStrings = Arrays.asList(str.split("[ ]"));
    return subStrings.stream()
        .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase())
        .reduce((x, y) -> (x + " " + y))
        .get();
  }

  public String foo(){
    String s = "djfhls";
    return s;
  }

  public Integer foo(int i){
    Integer s = Integer.valueOf(12);
    return s;
  }

}
