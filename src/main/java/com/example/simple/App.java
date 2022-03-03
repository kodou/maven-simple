package com.example.simple;

/**
 * Examples of simple kodou functions created by anyone.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    /**
     * Add the values of two Strings and return the sum as a String.
     *
     * @param a_str First String
     * @param b_str Second String
     * @return      The sum of the two String values
     */
    public static String addStringInts(String a_str, String b_str) {
        int A_num = Integer.valueOf(a_str);
        int B_num = Integer.valueOf(b_str);
        int sum = A_num + B_num;

        String answer = Integer.toString(sum);

        return answer;
    }

    /**
     * Add two ints and return the sum as an int.
     *
     * @param a_int First int
     * @param b_int Second int
     * @return      The sum of the two parameters
     */
    public static int add(int a_int, int b_int) {

        return a_int + b_int;

    }

}
