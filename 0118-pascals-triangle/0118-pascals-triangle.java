class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lis = new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List<Integer> res = new ArrayList<>();
            int ans=1;
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    res.add(1);
                } 
                else {
                    ans = ans * (i - j + 1) / j;
                    res.add(ans);
                }
            }
            lis.add(res);
        }
        return lis;
    }
}