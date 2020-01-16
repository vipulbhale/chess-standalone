package org.example.chess;

import org.example.chess.model.Board;
import org.example.chess.model.Player;
import org.example.chess.model.Square;
import org.example.chess.model.SquareType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        int id = 7;

        System.out.println("Id is "+Integer.toBinaryString(-2));
        System.out.println("Id is "+Integer.toBinaryString(~2 + 1));
        int postId = (id >>> 32);
        System.out.println("postId is "+Integer.toBinaryString((int)postId));
        System.out.println((int) (id ^ postId));
        String[][] sqCord = new String[][]{
                {"a1", "black"}, {"a2", "white"}, {"a3", "black"}, {"a4", "white"}, {"a5", "black"}, {"a6", "white"}, {"a7", "black"}, {"a8", "white"},
                {"b1", "white"}, {"b2", "black"}, {"b3", "white"}, {"b4", "black"}, {"b5", "white"}, {"b6", "black"}, {"b7", "white"}, {"b8", "black"},
                {"c1", "black"}, {"c2", "white"}, {"c3", "black"}, {"c4", "white"}, {"c5", "black"}, {"c6", "white"}, {"c7", "black"}, {"c8", "white"},
                {"d1", "white"}, {"d2", "black"}, {"d3", "white"}, {"d4", "black"}, {"d5", "white"}, {"d6", "black"}, {"d7", "white"}, {"d8", "black"},
                {"e1", "black"}, {"e2", "white"}, {"e3", "black"}, {"e4", "white"}, {"e5", "black"}, {"e6", "white"}, {"e7", "black"}, {"e8", "white"},
                {"f1", "white"}, {"f2", "black"}, {"f3", "white"}, {"f4", "black"}, {"f5", "white"}, {"f6", "black"}, {"f7", "white"}, {"f8", "black"},
                {"g1", "black"}, {"g2", "white"}, {"g3", "black"}, {"g4", "white"}, {"g5", "black"}, {"g6", "white"}, {"g7", "black"}, {"g8", "white"},
                {"h1", "white"}, {"h2", "black"}, {"h3", "white"}, {"h4", "black"}, {"h5", "white"}, {"h6", "black"}, {"h7", "white"}, {"h8", "black"},
        };
        Map<String, Square> boardMap = new HashMap<>();
        Arrays.stream(sqCord).forEachOrdered(
                boxArray -> {
                    System.out.println(boxArray[0]);
                    SquareType squareType = SquareType.WHITE;
                    if ("black".equalsIgnoreCase(boxArray[1]))
                        squareType = SquareType.BLACK;
                    Square square = new Square(boxArray[0]);
                    square.setSquareType(squareType);
                    boardMap.put(boxArray[0], square);
                }
        );
        // Initialize board with map
        Board board = new Board(boardMap);

        // Initialize players
        Player whitePlayer = new Player("white", "vipul");
        Player blackPlayer = new Player("black", "shweta");

        // Initialize pieces

        System.out.println(boardMap);

    }

    public static void initializePieces(){

    }
}