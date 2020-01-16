package org.example.chess.model;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<String, Square> squareMap = new HashMap<>();

    public Board(Map<String, Square> squareMap) {
        this.squareMap = squareMap;
    }

    public Map<String, Square> getSquareMap() {
        return squareMap;
    }

    public void setSquareMap(Map<String, Square> squareMap) {
        this.squareMap = squareMap;
    }



}
