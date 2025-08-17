package Collection;

import java.util.Vector;

public class VectorEg {
    // thread safe
    // puts lock when opn is performed on vector.
    // less efficient than ArrayList [ due to lock/unlock for each operation]
    public static void main(String[] args) {
      Vector <Integer> obj = new Vector<>();
 
      obj.add(0, 200);
      
    }
}
