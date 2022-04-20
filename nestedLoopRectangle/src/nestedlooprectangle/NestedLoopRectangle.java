/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedlooprectangle;

/**
 * NestedLoopRectangle.java 
 * Dean & Dean
 * This program uses nest looping to draw a rectangle
 *
 * @author 4800590195
 */
import java.util.Scanner;

public class NestedLoopRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner computerKeyboardInput = new Scanner(System.in);
        int height, width; //rectangle's dimensions
        char printCharacter;

        System.out.print("Enter height: ");
        height = computerKeyboardInput.nextInt();
        System.out.print("Enter width: ");
        width = computerKeyboardInput.nextInt();
        System.out.print("Enter character: ");
        printCharacter = computerKeyboardInput.next().charAt(0);

        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= width; col++) {
                System.out.print(printCharacter);
            }
            System.out.println();
        }
    } //end main
} // end class NestedLoopRectangle
