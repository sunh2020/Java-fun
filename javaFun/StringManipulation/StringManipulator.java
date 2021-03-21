public class StringManipulator {
    // public String trimAndConcat(String string1, String string2) {
    //     String stringOne = string1.trim();
    //     String stringTwo = string2.trim();
    //     String string3 = stringOne.concat(stringTwo);
    //     System.out.println(string3);
    //     return string3;
    
    // public Integer getIndexOrNull(String stringA, char charB) {
    //     int result = stringA.indexOf(charB);
    //     if (result >= 0) {
    //         return result;
    //     } else {
    //         return null;
    //     }
    // }
    // public Integer getIndexOrNull(String str, String str1) {
    //     Integer result = str.indexOf(str1);
    //     if (result == -1) {
    //         result = null;
    //     }
    //     return result; 
    // }
    public String concatSubstring(String strA, int A, int B, String strB) {
        String strS = strA.substring(A, B);
        String word = strS.concat(strB);
        return word;
    }
}