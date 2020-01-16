package org.example.chess.model.pieces;

import java.util.HashSet;
import java.util.Set;

public class Queen extends Piece {

    public Queen(boolean color) {
        this.possibleSquares = new HashSet<>();
        this.alive = true;
        if (!color) {
            this.white = false;
            this.currentSquare = "d8";
        } else {
            this.currentSquare = "d1";
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
    public void addPossibleSquares(String possibleSquare){
        this.getPossibleSquares().add(possibleSquare);
    }

    public String calculatePossibleMoves(){

        return "";
    }
}
