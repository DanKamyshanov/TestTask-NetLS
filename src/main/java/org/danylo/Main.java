package org.danylo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Point is inside the square: " +
                isPointInsideSquare(args[0], args[1], args[2], args[3], args[4]));
    }

    /**
     * @param sideLength - length of the side of the square
     * @param startingPointX - X-coordinate of the starting point of the square (точка відліку)
     * @param startingPointY - Y-coordinate of the starting point of the square (точка відліку)
     * @param pointX - X-coordinate of the point to be checked
     * @param pointY - Y-coordinate of the point to be checked
     */
    public static boolean isPointInsideSquare(String sideLength, String startingPointX, String startingPointY, String pointX, String pointY){

        boolean isInside = false;

        //as the program will be taking arguments from the command line in String, conversion to double is needed
        double length = Double.parseDouble(sideLength);
        double startX = Double.parseDouble(startingPointX);
        double startY = Double.parseDouble(startingPointY);
        double XPoint = Double.parseDouble(pointX);
        double YPoint = Double.parseDouble(pointY);

        //finding coordinates of the distant x/y coordinates
        double distantX = startX + length;
        double distantY = startY + length;

        //conditions to check whether the point is inside the square
        //starting point is always in the bottom-left corner of the square
        boolean outsideByX = XPoint < startX || XPoint > distantX;
        boolean outsideByY = YPoint < startY || YPoint > distantY;

        if(!(outsideByX || outsideByY)) isInside = true;

        return isInside;
    }
}