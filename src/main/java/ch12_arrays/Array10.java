package ch12_arrays;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int num = 0;
        // 이상의 2차 배열에 1 ~ 100 까지의 값을 집어 넣으시오.
        // Arrays.deepToString(nums);를 통해 출력하시오.
        /*
            실행 예
            [1,2,3,4,5],
            [6,7,8,9,10],
            [11,12,13,14,15],
            ...
            [..., 100]
         */
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] += ++num;
            }
        }
        System.out.println(Arrays.deepToString(nums));

        // 향상된 for문
        for(int[] numbers : nums){
            for(int number : numbers){
                System.out.print(number + " / ");
            }
        }
    }
}
