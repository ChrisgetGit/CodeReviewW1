import java.util.*;

public class Review {

    public static void calculateRectArea(int height, int width) {      //
        int rectArea = (height * width);
        System.out.println("\nThe rectangular area with height " +height + " and width " + width + " is:\n"+ rectArea);
    }

    public static void calculateSquareArea (int width2) {               //example 4: creating method
        int squareArea = (width2 * width2);
        int squarePerimeter = (width2* 4);
        System.out.println("\nThe square (with width " + width2+ "cm) area is: " + squareArea + "\nand the square perimeter is: "+ squarePerimeter);
        int[] rectArray = {squareArea, squarePerimeter};
    }

    public static void main(String[] args) {                            //example 1: executing main method
        System.out.println("The rectangular with a height of 5 and a width of 10 has an area of: \n" +10*5); //example 2:basic solution


        calculateRectArea(30,20);                          //example 3(2): executing method (rectangular)
        calculateRectArea(50,40);
        calculateRectArea(42, 42);                         //example 5: execute method at least 3 times
        calculateRectArea(50,60);

        calculateSquareArea(4);                                  //example 4: executing method(square)
        calculateSquareArea(2);                                  //example 5: execute method at least 3 times
        calculateSquareArea(5);
        calculateSquareArea(8);

        int[] heightArray = {30, 50 ,60, 80};                           //bonus(1): store data in arrays
        int[] widthArray = {20, 40, 50, 50};

        String result = "";
        System.out.println("\nheightArray: "+ Arrays.toString(heightArray));  //calculate and print out area of several rectangles
        System.out.println("\nwidthArray: "+ Arrays.toString(widthArray));
        for (int i = 0; i < heightArray.length; i++) {
            int num1 = heightArray[i];
            int num2 = widthArray[i];
            result += (num1 * num2) + " ";
        }
        System.out.println("\narea= "+result);
    }
}
















