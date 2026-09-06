class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0;
        int c2=0;
        int e1=Integer.MIN_VALUE;
        int e2=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(c1==0 && e2 != nums[i]){e1=nums[i];c1++;}
            else if(c2==0 && e1 != nums[i]){e2=nums[i];c2++;}
            else if(e1==nums[i]){c1++;}
            else if(e2==nums[i]){c2++;}
            else{c1--;c2--;}
        }

        c1 = 0;
        c2 = 0;

        for (int num : nums) {
            if (num == e1) {
                c1++;
            }
            else if (num == e2) {
                c2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if (c1 > nums.length / 3) {result.add(e1);}
        if (c2 > nums.length / 3) {result.add(e2);}
        return result;
    }
}