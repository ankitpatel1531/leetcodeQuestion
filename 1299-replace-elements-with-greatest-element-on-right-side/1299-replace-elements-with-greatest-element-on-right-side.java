class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {

            int temp = arr[i];

            arr[i] = max;

            max = Math.max(max, temp);
        }

        return arr;


        

        /*
        int n = arr.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
        
            int max = -1;
        
            for (int j = i + 1; j < n; j++) {
        
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
        
            ans[i] = max;
        }
        
        return ans;
        */
    }
}