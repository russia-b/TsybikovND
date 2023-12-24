package Task1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class WithoutDuplicate {
    public static <T> List<T> removeDuplicates(List<T> inputList) {
        Set<T> uniqueSet = new HashSet<>(inputList);
        return new ArrayList<>(uniqueSet);
    }
}
