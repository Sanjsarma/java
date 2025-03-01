import java.util.ArrayList;
import java.util.List;

//final class so can't be inherited.
final class ImmutableClass {

    // all vars are private
    private final String name;
    private final List<Object> list;

    ImmutableClass(String name, List<Object> list) {
        this.name = name;
        this.list = list;
    }

    // only getters, no setters.
    public String getName() {
        return name;
    }

    public List<Object> getList() {
        return new ArrayList<>(list);
    }
    
}
