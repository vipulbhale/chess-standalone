package org.example.chess.model.pieces;

import java.util.Set;

public abstract class Piece {

    protected boolean white = true;
    protected String currentSquare;
    protected boolean alive = true;
    protected Set<String> possibleSquares;

    public abstract void addPossibleSquares(String possibleSquare);

    public abstract String calculatePossibleMoves();
}
