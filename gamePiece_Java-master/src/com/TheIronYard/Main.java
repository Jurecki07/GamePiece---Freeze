package com.TheIronYard;

public class Main {

    public static void main(String[] args) {

        GamePiece gamePiece = new GamePiece();

       // gamePiece.setColor("white");
        //knight.setName("Sir Robin");

        if (!gamePiece.isFrozen()) {
            gamePiece.freeze();
        System.out.println(knight.frozen);
        }

        if (gamePiece.isFrozen()) {
            gamePiece.unfreeze();
            System.out.println(knight.frozen);
        }


        if (!gamePiece.isFrozen()) {
            System.out.println("positionX before moving: " + gamePiece.getPositionX());
            System.out.println("positionY before moving: " + gamePiece.getPositionY());

            gamePiece.move(3, 4);
            System.out.println("positionX after moving: " + gamePiece.getPositionX());
            System.out.println("positionY after moving: " + gamePiece.getPositionY());
        }

        if (gamePiece.isFrozen()) {
            System.out.println(knight.getName()+" is frozen and can't move");
        }





    }
}

So I can commit