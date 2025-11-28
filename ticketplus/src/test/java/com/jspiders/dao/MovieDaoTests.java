package com.jspiders.dao;

public class MovieDaoTests {

    public static void main(String[] args) {
        testAddMovie();
    }

    public static void testAddMovie()
    {
        System.out.println("Testing ADD Movie");
        try {
            MovieDao movieDao = new MovieDao();
            movieDao.addMovie();
            System.out.println("✅ADD MOVIE Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌ADD MOVIE Test FAILED");
        }
    }
}
