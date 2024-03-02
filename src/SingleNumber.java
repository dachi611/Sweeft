public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={5,2,4,6,2,4,9,6,3,6,2,3,5,4};
        System.out.print(singleNumber(nums));
    }
    static int singleNumber(int[] nums){
        for (int num : nums){
            int count=0;
            for(int i=0 ; i<nums.length ; i++){
                if(num==nums[i]){
                    count++;
                }
            }
            if(count==1)return num;
        }
        return -1;
    }
}