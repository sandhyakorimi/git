package level2;

import java.util.Scanner;

public class LcmNGcdofArray {
    public static int GCDofTwo(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int LCDofTwo(int a, int b){
        return (a*b)/GCDofTwo(a,b);
    }

    public static int GCDofArray(int[] arr){
        int gcd = arr[0];
        for(int i =1; i<arr.length; i++){
            gcd = GCDofTwo(gcd, arr[i]);
        }
        return gcd;
    }

    public static int LCMofArray(int[] arr){
        int  lcm = arr[0];
        for(int i=1; i<arr.length; i++){
            lcm = LCDofTwo(lcm, arr[i]);
        }
        return lcm;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of numbers : ");
        int n = sc. nextInt();
        int[] nums = new int[n];
        System.out.println("Enter numbers : ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int LCM = LCMofArray(nums);
        int GCD = GCDofArray(nums);

        System.out.println("Lcm of the above numbers is : "+LCM);
        System.out.println("Gcd of the above numbers is : "+GCD);

         sc.close();
    }
    
}
