import java.util.ArrayList;
import java.util.Collections;

public class BasicJava {
// 1. Print 1-255
// Write a method that prints all the numbers from 1 to 255.
// 
//     public void print255() {
//         for (int i = 1; i < 256; i++){
//             System.out.println(i);
//     }
//     }


// 2. Print odd numbers between 1-255
// Write a method that prints all the odd numbers from 1 to 255.
// 
//     public void printOdd() {
//         for (int i = 1; i < 256; i++){
//             if (i % 2 != 0) {
//             System.out.println(i);
//         }
//     }
// }


// 3. Print Sum
// Write a method that prints the numbers from 0 to 255, 
// but this time print the sum of the numbers that have been printed so far. 
// For example, your output should be something like this:
// Do NOT use an array to do this exercise.
// 
//     public void printSum() {
//         for (int i = 0; i < 256; i++){
//             System.out.println("New number" + i);
//             System.out.println("Sum" + i);
//         }
//     }



// 4. Iterating through an array
// Given an array X, say [1,3,5,7,9,13], write a method that would iterate 
// through each member of the array and print each value on the screen. 
// Being able to loop through each member of the array is extremely important.
// 
//     public void IterateArr(int[] x) {
//         for (int i = 0; i < x.length; i++){
//             System.out.println(x[i]);
//         }
//     }



// 5. Find Max
// Write a method (sets of instructions) that takes any array and prints 
// the maximum value in the array. Your method should also work with a 
// given array that has all negative numbers (e.g. [-3, -5, -7]), 
// or even a mix of positive numbers, negative numbers and zero.
// 
//     public void findMax(int[] array) {
//         int max = array[0];
//         for (int i = 0; i < array.length; i++){
//             if(array[i] > max){
//                 max = array[i];
//             }
//         }
//     System.out.println(max);
//     }


// 6. Get Average
// Write a method that takes an array, and prints the AVERAGE of the values 
// in the array. For example for an array [2, 10, 3], your method should print 
// an average of 5. Again, make sure you come up with a simple base case and write 
// instructions to solve that base case first, then test your instructions 
// for other complicated cases.
// 
//     public void getAvg(double[] arr) {
//         double avg;
//         double sum = 0;
//         for (int i = 0; i < arr.length; i++){
//             sum = sum + arr[i];
//         }
//         avg = sum / arr.length; 
//         System.out.println(avg);
//     }


// 7. Array with Odd Numbers
// Write a method that creates an array 'y' that contains all the odd numbers 
// between 1 to 255. When the method is done, 'y' should 
// have the value of [1, 3, 5, 7, ... 255].
    // public void arrOdd(){
    //     ArrayList<Integer> y = new ArrayList<Integer>();
    //     for (int i = 1; i < 256; i++){
    //         if(i % 2 != 0) {
    //             y.add(i);
    //         }
    //     }
    //     System.out.println(y);  
    // }

// 8. Greater Than Y
// Write a method that takes an array and returns the number of values in 
// that array whose value is greater than a given value y. For example, 
// if array = [1, 3, 5, 7] and y = 3, after your method is run it will 
// print 2 (since there are two values in the array that are greater than 3).
    // public void greaterY(int[] arr, int y) {
    //    int count = 0;
    //     for (int i = 0; i < arr.length; i++){
    //         if(arr[i] > y){
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
    // } 




// 9. Square the values
// Given any array x, say [1, 5, 10, -2], write a method that multiplies 
// each value in the array by itself. When the method is done, the array 
// x should have values that have been squared, say [1, 25, 100, 4].
//     public void squareValue(int[] x){
//         ArrayList<Integer> r = new ArrayList<Integer>();
//         for (int i = 0; i < x.length; i++){
//             x[i] = x[i] * x[i];
//             r.add(x[i]);
//         }
//         System.out.println(r);
//     }
// }
 
// 10. Eliminate Negative Numbers
// Given any array x, say [1, 5, 10, -2], write a method that replaces 
// any negative number with the value of 0. When the method is done, 
// x should have no negative values, say [1, 5, 10, 0].

// public void eliNegative(int[] x){
//         ArrayList<Integer> arr = new ArrayList<Integer>();
//         for (int i = 0; i < x.length; i++){
//             if(x[i] < 0){
//                 x[i] = 0;
//         }
//         arr.add(x[i]);
//         }
//         System.out.println(arr);
//     }
// }


// 11. Max, Min, and Average
// Given any array x, say [1, 5, 10, -2], write a method that returns 
// an array with the maximum number in the array, the minimum value in 
// the array, and the average of the values in the array. The returned 
// array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
// public void maxminAvg(int[] x){
//         ArrayList<Integer> newArr = new ArrayList<Integer>();
//         int max = x[0];
//         int min = x[0];
//         int sum = 0;
//         for (int i = 0; i < x.length; i++){
//             if(x[i] > max){
//                 max = x[i];
//             }
//             if(x[i] < min){
//                 min = x[i];
//             }
//             sum += x[i];     
//         }
//         int avg = sum/x.length;
//         Collections.addAll(newArr, max, min, avg);
//         System.out.println(newArr);
//         }
//     }



// 12. Shifting the Values in the Array
// Given any array x, say [1, 5, 10, 7, -2], write a method that shifts 
// each number by one to the front. For example, when the method is done, 
// an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that 
// the last number is 0. The method does not need to wrap around 
// the values shifted out of bounds.
public void shifValue(int[] x){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < x.length; i++){
            if(i == x.length - 1){
                newArr.add(0);
            }
            else{
                newArr.add(x[i+1]);
            }
        }  
        System.out.println(newArr);
        }
    }

