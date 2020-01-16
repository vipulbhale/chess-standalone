package org.example.chess.model;

import org.example.chess.model.pieces.Piece;

public class Square {

    private SquareType squareType ;
    private boolean hasAPiece;
    private String coordinate;

    private Piece piece;

    public Square(String coordinate) {
        this.coordinate = coordinate;
    }

    public SquareType getSquareType() {
        return squareType;
    }

    public void setSquareType(SquareType squareType) {
        this.squareType = squareType;
    }

    public boolean isHasAPiece() {
        return hasAPiece;
    }

    public void setHasAPiece(boolean hasAPiece) {
        this.hasAPiece = hasAPiece;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareType=" + squareType +
                ", hasAPiece=" + hasAPiece +
                ", coordinate='" + coordinate + '\'' +
                ", piece=" + piece +
                '}';
    }
}
