package com.teamdev;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(8080);

        get("/main", (req, res) -> "Hello world!");
    }
}