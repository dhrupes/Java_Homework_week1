package week1;
       /*2.Write a Java program to compute the specified expressions and print the output.
Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889*/
public class ExtraHw {

    public static void main(String[] args){
        Double a= 25.5;
        Double b= 3.5;
        Double c= 40.5;
        Double d= 4.5;
        System.out.println("Expected output  ");
        System.out.println((a*b - b*b) / (c-d));
    }


    }
