import java.util.*;

public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
       int j, k, l,sum;
        Collections.sort(A);
        int n = A.size();
        int val = A.get(0) + A.get(1) + A.get(2);    
        
        for (j = 0; j < n - 2; j++) {

            l=j+1;
            k=n-1;
            int num = B - A.get(j);
            
            while (l < k) {
                
                sum = A.get(l) + A.get(k);
                
                if (sum == num)
                    return B;
                else if (sum < num) {
                    l++;
                } else {
                    k--;
                }
                
                int diff = Math.abs(sum - num);
                int otherDiff = Math.abs(val - B);
                
                if (diff < otherDiff)
                    val = sum + A.get(j);
                
            }
            
        }
        
        
        return val;
    }
}
