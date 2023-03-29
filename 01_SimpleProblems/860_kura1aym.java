class Solution {
    public boolean lemonadeChange(int[] a) {
        int[] cnt = new int[21];
        for (int x: a) {
            cnt[x]++;
            x -= 5;
            if (x == 0) continue;
            if (x == 5) {
                if (cnt[x] > 0) {
                    cnt[x] -= 1;
                } else {
                    return false;
                }
            }
            if (x == 15) {
                if (cnt[10] > 0 && cnt[5] > 0) {
                    cnt[10] -= 1;
                    cnt[5] -= 1;
                } else if (cnt[5] >= 3) {
                    cnt[5] -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
