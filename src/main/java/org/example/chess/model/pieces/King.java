package org.example.chess.model.pieces;

import org.example.chess.IllegalMoveException;
import org.example.chess.util.SquareDirection;
import org.example.chess.util.Utility;

import java.util.HashSet;
import java.util.Set;

public class King extends Piece {

    public King(boolean color) {
        this.possibleSquares = new HashSet<>();
        this.alive = true;
        if (!color) {
            this.white = false;
            this.currentSquare = "e8";
        } else {
            this.currentSquare = "e1";
        }
    }

    public boolean isWhite() {
        return (this.white) ? true : false;
    }

    public String getCurrentSquare() {
        return this.currentSquare;
    }

    public void setCurrentSquare(String currentSquare) {
        this.currentSquare = currentSquare;
    }

    public boolean isKilled() {
        return (this.alive) ? true : false;
    }

    public void setKilled(boolean killed) {
        this.alive = killed;
    }

    public Set<String> getPossibleSquares() {
        return this.possibleSquares;
    }

    public void setPossibleSquares(Set<String> possibleSquares) {
        this.possibleSquares = possibleSquares;
    }

    @Override
    public void addPossibleSquares(String possibleSquare) {
        this.getPossibleSquares().add(possibleSquare);
    }

    public String calculatePossibleMoves() {
        Set<String> possibleSquares = new HashSet<>();
        for (SquareDirection squareDirection : SquareDirection.values()) {
            try {
                possibleSquares.add(Utility.getNextSquare(this.getCurrentSquare(), squareDirection, 1));
            } catch (IllegalMoveException e) {
                continue;
            }
        }
        return "";
    }
}
