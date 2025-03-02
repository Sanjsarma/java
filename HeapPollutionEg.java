import java.util.ArrayList;
import java.util.List;

public class HeapPollutionEg {
  // eg of heap pollution
  // to suppress heap pollution warnings, can use @SafeVarArgs
  public static void printVal(List<Integer> ...logNumList) {
    Object[] objectLost = logNumList;

    List<String> stringList = new ArrayList<>();
    stringList.add("Hello");
    objectLost[0] = stringList;
  }
}

