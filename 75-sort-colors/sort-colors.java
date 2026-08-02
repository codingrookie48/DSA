class Solution {
  public void sortColors(int[] nums) {
    int start = 0;
    int end = nums.length - 1;

    for (int i = 0; i <= end;)
      if (nums[i] == 0)
        swap(nums, i++, start++);
      else if (nums[i] == 1)
        ++i;
      else
        swap(nums, i, end--);
  }

  private void swap(int[] nums, int i, int j) {
    final int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
 

