package LeetcodeLearning.src;

public class SearchInsertPosition {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if (A == null || A.length == 0) {
            return -1;
        }
        if (target < A[0]) {
            return 0;
        }
        int start = 0;
        int end = A.length - 1;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (A[mid] == target) {
                return mid;
            } else if (A[mid] > target) {
                end = mid;
            } else if (A[mid] < target) {
                start = mid;
            }
        }
        if (A[end] == target) {
            return end;
        } else if (A[end] < target) {
            return end + 1;
        } else if (A[start] == target) {
            return start;
        } else {
            return start + 1;
        }
    }
}
