class Solution {
    public int missingNumber(int[] nums) {
        int i =0; 
        int correct = nums[i];
        if( nums[i]<  nums.length && nums[i] != nums[correct]){
            swap(nums,i,correct);
        }else{i++;
        }
        for(int index = 0; index < nums.length ; index++)
        if (nums[index] != index){
            return index;
        }return nums.length;
        
    }
    void swap (int [] nums , int first ,int secound){
        int temp = nums[first];
        nums[first] = nums[secound];
         nums[secound] = temp;
    }

}