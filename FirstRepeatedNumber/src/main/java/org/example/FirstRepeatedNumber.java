package org.example;

public class FirstRepeatedNumber {
    public static int firstRepeatedNumber(int[] arr){
        int a = arr.length;
        for (int i = 0; i < a; i++){
            for (int j = i + 1; j < a; j++){

                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,6,7,8,9};
        int n = firstRepeatedNumber(arr);
        if (n != -1){
            System.out.println(n);
        }else {
            System.out.println("no repeated number found");
        }
    }
}
//1 . Given an integer arr[], write an algorithm to return the index of the firstRepeatingNumber

