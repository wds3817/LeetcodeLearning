/**
 * Created by Administrator on 2020/5/12.
 */
public class findPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid;
            } else if (nums[mid - 1] > nums[mid]) {
                end = mid;
            } else {
                end = mid;
            }
        }
        if (nums[start] < nums[end]) {
            return end;
        } else {
            return start;
        }
    }
}
