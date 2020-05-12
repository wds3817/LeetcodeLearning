/**
 * Created by Administrator on 2020/5/12.
 */
public class finFirstBadVersion {

        public class Solution extends VersionControl {
            public int firstBadVersion(int n) {
                int start = 0;
                int end = n;
                while (start + 1 < end) {
                    int mid = start + (end - start) / 2;
                    if (isBadVersion(mid)) {
                        end = mid;
                    } else {
                        start = mid + 1;
                    }
                }
                if (isBadVersion(start)) {
                    return start;
                } else {
                    return end;
                }
            }
        }

}
