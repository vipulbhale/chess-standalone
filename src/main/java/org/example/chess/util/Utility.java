package org.example.chess.util;

import org.example.chess.IllegalMoveException;

public class Utility {

    public static String getNextSquare(String currentSquare, SquareDirection squareDirection, int numberOfSquares) throws IllegalMoveException {
        switch (squareDirection) {
            case INCREASEFILE: {
                return increaseFile(currentSquare, numberOfSquares);
            }
            case INCREASERANK: {
                return increaseRank(currentSquare, numberOfSquares);
            }
            case DECREASEFILE: {
                return decreaseFile(currentSquare, numberOfSquares);
            }
            case DECREASERANK: {
                return decreaseRank(currentSquare, numberOfSquares);
            }
        }
        return "";
    }

    private static String increaseFile(String currentSquare, int numberOfSquare) throws IllegalMoveException {
        if ((char) (currentSquare.charAt(0) + numberOfSquare) > 'h')
            throw new IllegalMoveException("File is going beyond H file");
        return (char) (currentSquare.charAt(0) + numberOfSquare) + "" + currentSquare.charAt(1);
    }

    private static String decreaseFile(String currentSquare, int numberOfSquare) throws IllegalMoveException {
        if ((char) (currentSquare.charAt(0) - numberOfSquare) < 'a')
            throw new IllegalMoveException("File is going beyond A file");
        return (char) (currentSquare.charAt(0) - numberOfSquare) + "" + currentSquare.charAt(1);
    }

    private static String increaseRank(String currentSquare, int numberOfSquare) throws IllegalMoveException {
        if ((currentSquare.charAt(1) + numberOfSquare) > 8)
            throw new IllegalMoveException("Rank is going beyond 8th rank");
        return (currentSquare.charAt(0) + "" + (currentSquare.charAt(1) + numberOfSquare));
    }

    private static String decreaseRank(String currentSquare, int numberOfSquare) throws IllegalMoveException {
        if ((currentSquare.charAt(1) + numberOfSquare) < 1)
            throw new IllegalMoveException("Rank is going beyond 1st rank");
        return (currentSquare.charAt(0) + "" + (currentSquare.charAt(1) - numberOfSquare));
    }
}
