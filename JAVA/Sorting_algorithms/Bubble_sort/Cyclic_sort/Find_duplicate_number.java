package ravi.cyclic_sort;

public class Find_duplicate_number {
    public static void main(String[] args) {
        int[] nums = {3,4,1,2,2};
        int ans = find_duplicates(nums);
        System.out.println(ans);
    }

    static int find_duplicates(int[] nums) {
        int i = 0;
        while (i < nums.length){
            if (nums[i] != i +1){
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else {
                    return nums[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr,int first,int second){
        int tem = arr[first];
        arr[first] = arr[second];
        arr[second] = tem;
    }
}
