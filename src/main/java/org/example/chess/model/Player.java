package org.example.chess.model;

import org.example.chess.model.pieces.Piece;

import java.util.List;

public class Player {
    private String color;
    private String name ;
    private List<Piece> pieces;

    public Player(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }


    @Override
    public String toString() {
        return "Player{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", pieces=" + pieces +
                '}';
    }

    public void movePiece(Piece piece, String currentSquare, String destinationSquare ){

    }

}
