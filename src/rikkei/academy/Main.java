package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("chọn tổng số phần tử trong mảng: ");
        int size = scanner.nextInt();
        int[] array;
        array = new int[size];
        int i= 0;
        while (i< array.length){
            System.out.print("enter element " +(i+1)+" : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("list array: " );
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] +" ");
        }

        int index = minValue(array);
        System.out.println(".số nhỏ nhất trong mảng: "+ array[index]);

//        int[] arr = {1, 6, 4, 9, 3, 5, 0};
//        int index = minValue(arr);
//        System.out.println("Số nhỏ nhất trong mảng là: " + arr[index]);
    }

//    public static int minValue(int[] arr) {
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < arr[index]) {
//                index = i;
//            }
//        }
//        return index;
//
//    }

    public static int minValue(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }


}