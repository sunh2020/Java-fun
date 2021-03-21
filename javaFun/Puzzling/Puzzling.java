import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
// public class CodeExample {
//     public static void main() {
//         ArrayList<Integer> numbers = new ArrayList<Integer>();
//         numbers.add(5);
//         numbers.add(4);
//         numbers.add(3);
//         numbers.add(2);
//         numbers.add(1);
        
//         Collections.shuffle(numbers);
//         System.out.println(numbers); // [1, 5, 2, 4, 3]
//         Collections.sort(numbers);
//         System.out.println(numbers); // [1, 2, 3, 4, 5]
                
//         Random r = new Random();
//         System.out.println(r.nextInt()); // without bounds
//         System.out.println(r.nextInt(5)); // with bounds 0 to 5
//     }
// }

public class PuzzleJava {
// ● Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
//1
    public void greaterTen(int[] x){
     int sum = 0;
     for(int i = 0; i < arr.lengthl i++){
         sum += x[i];
         if(x[i] > 10){

            System.out.println(x[i]);
         }
     }
 }







}


// ● Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.

// ● Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.

// To shuffle a collection, you can use the shuffle method of the Collections class. Collections Class documentation
// ● Generate and return an array with 10 random numbers between 55-100.

// To get a random integer, you can use the nextInt method of the Random class. Random Class documentation
// ● Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.

// To sort a collection, you can use the sort method of the Collections class.
// ● Create a random string that is 5 characters long.

// ● Generate an array with 10 random strings that are each 5 characters long