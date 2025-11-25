class Solution {
   public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> triplets = new ArrayList<>();

        Arrays.sort(nums);

        int size = nums.length;
        for (int i = 0; i < size && nums[i] <= 0; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                findTriplet(nums, triplets, i, i + 1, size - 1);
            }
        }

        return triplets;
    }

    public static void findTriplet(int[] nums, List<List<Integer>> triplets, int i, int j, int k) {
        int target = (-1) * nums[i];

        while (j < k) {
            int sum = nums[j] + nums[k];

            if (sum == target) {
                triplets.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));
                j++;
                k--;

                while (j < k && nums[j - 1] == nums[j]) {
                    j++;
                }
            } else if (sum > target) {
                k--;
            } else {
                j++;
            }
        }
    }
}
