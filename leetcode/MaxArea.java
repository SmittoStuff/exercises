class MaxArea {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                if ((Math.min(height[i], height[j]) * (i - j)) > maxArea) {
                    maxArea = Math.min(height[i], height[j]) * (i - j);
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}