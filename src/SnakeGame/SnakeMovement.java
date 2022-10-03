package SnakeGame;

public interface SnakeMovement{
    abstract void moveUp();
    abstract void moveDown();
    abstract void moveRight();
    abstract void moveLeft();


    abstract void pickupItem();
    abstract void extendLength();
    abstract void displayCurrentLength();
    abstract void die();
    abstract void spawnItem();
    abstract void displayPosition();
    abstract void displayItemPosition();
    abstract void displayLength();
}
