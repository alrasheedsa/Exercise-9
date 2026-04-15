package org.Exercise9;
public class MovablePoint implements Movable {

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(){}

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }




    //use hte methid that created in class Movable and set moveUp, moveDown, moveLeft, moveRight
    // print toString as overriding
    public void moveUp() {
        y += ySpeed;
        System.out.println("Move up "+ ySpeed);
    }

    public void moveDown() {
        y -= ySpeed;
        System.out.println("Move down "+ ySpeed);
    }

    public void moveLeft() {
        x -= xSpeed;
        System.out.println("Move left "+ xSpeed);

    }

    public void moveRight() {
        x += xSpeed;
        System.out.println("Move right "+ xSpeed);
    }

    @Override
    public String toString() {
        return "MovablePoint {" +
                "x = " + x +
                ", y = " + y +
                ", xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                '}';
    }
}
