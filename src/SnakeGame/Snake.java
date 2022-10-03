package SnakeGame;

public class Snake implements SnakeMovement {
    int posX = 0;
    int posY = 0;
    boolean gameLoop = true;
    int length = 3;

    int itemPosX = 5;
    int itemPosY = 5;

    @Override
    public void moveUp() {
        posX += 1;

    }

    @Override
    public void moveDown() {
        posX -= 1;
    }

    @Override
    public void moveRight() {
        posY += 1;
    }

    @Override
    public void moveLeft() {
        posY -= 1;
    }

    @Override
    public void pickupItem() {
        if (posX == itemPosX && posY == itemPosY){
            length++;
            System.out.println("");
            System.out.println("************");
            System.out.println("Item Pickup!");
            System.out.println("************");
            System.out.println("");

            spawnItem();
        }

    }

    @Override
    public void spawnItem() {
        itemPosX = 3;
        itemPosY = 3;
    }

    @Override
    public void extendLength() {

    }

    @Override
    public void displayCurrentLength() {
        System.out.println(length);
    }

    @Override
    public void die() {
        gameLoop = false;
    }

    @Override
    public void displayPosition() {
        System.out.println("Head Position: " + posX + " , " + posY);
    }

    @Override
    public void displayItemPosition() {
        System.out.println("Item Position: " + itemPosX + " , " + itemPosY);
    }

    @Override
    public void displayLength() {
        System.out.println("Length: " + length);
    }
}
