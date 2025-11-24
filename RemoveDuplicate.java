package Dailydsa;

import java.util.Set;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
            int i = 0;
            for (int val : set) {
                nums[i++] = val;
            }

        }
        return set.size();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoveDuplicate RD = new RemoveDuplicate();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }


        int newsize = RD.removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newsize; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}