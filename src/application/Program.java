package application;

import java.util.Scanner;

import boardgame.Position;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row: ");
        int row = sc.nextInt();
        System.out.print("Enter the column: ");
        int column = sc.nextInt();
        
        Position position = new Position(row, column);

        System.out.println(position);


















        sc.close();
        
        
    }
    
}