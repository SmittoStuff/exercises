import java.util.List;
import java.util.ArrayList;

class MedianSortedArrays {
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int nums1Length = nums1.length;
      int nums2Length = nums2.length;
      List<Integer> nums = new ArrayList<Integer>();
      int i1 = 0, i2 = 0;
      while (i1 < nums1Length && i2 < nums2Length) {
          if (nums1[i1] <= nums2[i2]) {
              nums.add(nums1[i1++]);
          } else {
              nums.add(nums2[i2++]);
          }
      }
      while (i1 < nums1Length) {
          nums.add(nums1[i1++]);
      }
      while (i2 < nums2Length) {
          nums.add(nums2[i2++]);
      }
      int numLength = nums.size();
      if ((numLength % 2) == 0) {
          return ((nums.get((numLength / 2) - 1) + nums.get(numLength / 2))) / 2.0;
      } else {
          return (nums.get(numLength / 2));
      }      
  }

  public static void main(String[] args) {
      int nums1[] = {1,3};
      int nums2[] = {2,4};
      System.out.println(findMedianSortedArrays(nums1, nums2));
  }
}