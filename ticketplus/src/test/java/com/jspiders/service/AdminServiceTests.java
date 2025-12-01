package com.jspiders.service;
import com.jspiders.users.AdminServiceImpl;

public class AdminServiceTests {
    public static void main(String[] args) {
        createMovieTest();
    }
    private static void createMovieTest() {
        System.out.println("Testing ADD Movie");
        try {
            AdminServiceImpl adminService = new AdminServiceImpl();
            adminService.createMovie();
            System.out.println("✅ADMIN - Create Movie Test PASSED");
        }
        catch (Exception ex) {
            System.err.println("❌ADMIN - Create Movie Test FAILED");
            ex.printStackTrace();
        }
    }
}
