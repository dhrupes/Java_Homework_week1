package week1;
/*9. Write a Java program to print the result of the following operations.
Test Data: a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output : 43
1
19
13  */
public class MultiData {

    public static void main (String[] arg) {
        int a= -5;// int is a datatype and a is vaiable name which store value -5.
        int b=  8;// int is a datatype and b is vaiable name which store value 8.
        int c= 6;// int is a datatype and c is vaiable name which store value 6.
        int d = 55;// int is a datatype and d is vaiable name which store value 55.
        int e =9;// int is a datatype and e is vaiable name which store value 9.
        int f= d+e; // int is a datatype and f is vaiable name which store value d+e.
        int g = 9; // int is a datatype and g is vaiable name which store value 9.
        int h = 20;// int is a datatype and h is vaiable name which store value 20.
        int i = -3; // int is a datatype and i is vaiable name which store value -3.
        int j= 5;  // int is a datatype and j is vaiable name which store value 5.
        int k=15; int l=3; int m=2;
      System.out.println("Expected out put = " +(a+b*c));
      System.out.println(f%g);
      System.out.println(+(h+i*j/b));
      System.out.println(j+k/l*m-b%l);
    }





}
