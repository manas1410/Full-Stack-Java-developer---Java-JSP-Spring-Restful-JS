package org.codingmunda;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // (a+b)^2 = a^2 + 2ab + b^2
        int x = 1234,sumOfDigits=0;
        while(x>0){
            sumOfDigits +=+  (x%10);
            x /= 10;
        }
        System.out.println("Sum of Digits = "+sumOfDigits);

    }
}