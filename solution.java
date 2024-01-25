class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int z = 0;
        int x = 0;
        int q = nums1.length - 1;
        if (m == 0 && nums1.length > 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        } else if (nums1.length > m) { // Check nums1 has more spaces than nums2
            // Loops until q = 0 && both m-1 and n-1 become 0
            while (q >= 0) {
                // Three conditions : m-1 < 0 ; n-1 < 0 ; both m & n are in positive region
                if (m - 1 < 0) {
                    nums1[q] = nums2[n - 1];
                    n--;
                } else if (n - 1 < 0) {
                    nums1[q] = nums1[m - 1];
                    m--;
                } else {
                    if (nums1[m - 1] >= nums2[n - 1]) {
                        nums1[q] = nums1[m - 1];
                        m--;
                    } else {
                        nums1[q] = nums2[n - 1];
                        n--;
                    }
                }
                q--;
            }
        }
    }
}
