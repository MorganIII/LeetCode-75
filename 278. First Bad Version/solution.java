/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1) return 1;
        int first = 1;
        int last = n;
        int mid = first + (last - first) / 2;
        int badVersion = 1;
        while(first <= last) {
            if(isBadVersion(mid)) {
                badVersion = mid;
                last = mid - 1;
            } else {
                first = mid + 1;
            }
            mid = first + (last - first) / 2;
        }
        return badVersion;
    }
}