package org.example.chess.model;

public class Game {

    private Player whitePlayer;
    private Player blackPlayer;
    private Board board;

    public Game(Player whitePlayer, Player blackPlayer, Board board) {
        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;
        this.board = board;
    }

}
