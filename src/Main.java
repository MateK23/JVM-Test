import SnakeGame.Snake;
import GUI.GUI;
import SnakeGUI.SnakeGUI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new SnakeGUI();

        boolean gameLoop = true;

        Snake snakeGame = new Snake();

        while(gameLoop){
            System.out.print("Action (up, down, left, right, score, end): ");

            try {
                Scanner scanner = new Scanner(System.in);
                String action = scanner.next().toLowerCase();

                switch (action){
                    case "u":
                    case "up":
                        snakeGame.moveUp();
                        snakeGame.pickupItem();
                        snakeGame.displayLength();
                        snakeGame.displayItemPosition();
                        snakeGame.displayPosition();

                        break;
                    case "d":
                    case "down":
                        snakeGame.moveDown();
                        snakeGame.pickupItem();
                        snakeGame.displayLength();
                        snakeGame.displayItemPosition();
                        snakeGame.displayPosition();

                        break;
                    case "r":
                    case "right":
                        snakeGame.moveRight();
                        snakeGame.pickupItem();
                        snakeGame.displayLength();
                        snakeGame.displayItemPosition();
                        snakeGame.displayPosition();

                        break;
                    case "l":
                    case "left":
                        snakeGame.moveLeft();
                        snakeGame.pickupItem();
                        snakeGame.displayLength();
                        snakeGame.displayItemPosition();
                        snakeGame.displayPosition();

                        break;
                    case "score":
                        snakeGame.displayLength();
                        snakeGame.displayPosition();
                        break;
                    case "end":
                        gameLoop = false;
                    default:
                        throw new InputMismatchException();
                }
            }
            catch (InputMismatchException e){
                System.out.println("Input Mismatch ERROR");
            }
            catch(Exception e) {
                System.out.print("ERROR: ");
                System.out.println(e.toString().toUpperCase());
            }
        }
    }
}
