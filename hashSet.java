import java.util.Collection;
import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        Collection<Integer> nums = new HashSet<>();

        nums.add(5);
        nums.add(6);
        nums.add(3);
        nums.add(9);
        nums.add(3);
        nums.add(5);

        // for(int n: nums) {
        //     System.out.println(n);
        // }

        System.out.println(nums);
    }
}
