public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        
       Collections.sort(A);
        int res = 0;
        int min = Integer.MAX_VALUE;
        for (int i=0; i< A.size()-2; i++) {
            int j = i+1;
            int k = A.size()-1;
            while (j<k) {
                int sum = A.get(i) + A.get(j) + A.get(k);
                int diff = Math.abs(sum - B);
                if (diff == 0) {
                    return B;
                }
                if (diff < min) {
                    min = diff;
                    res = sum;
                }
                if(sum <= B) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return res;
        
        
    }
}
