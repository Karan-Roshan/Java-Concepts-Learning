import java.util.ArrayList;
import java.util.Collection;

public class arrayList {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(6);
        nums.add(3);
        nums.add(9);
        nums.add(3);

        // for(int n: nums) {
        //     System.out.println(n);
        // }

        System.out.println(nums);
    }
}
