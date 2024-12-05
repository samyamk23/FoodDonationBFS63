package org.food.donation.Client;

import org.food.donation.Dao.UserDao;
import org.food.donation.Impl.UserImpl;
import org.food.donation.Model.User;

import java.util.Scanner;

/**
 * @Author : Samyam Kafle
 * @Portfolio : https://samyamkafle.com.np
 * @Project : FoodDonation
 * @CreatedDate : 05/12/2024, Thursday
 **/
public class FoodDonation {
    private static Scanner scanner = new Scanner(System.in);
    public static void init(){
        showWelcomeMenu();
        System.out.println("Please select the operation You wanna perform!");
        int choice = scanner.nextInt();
        UserDao userDaoService = new UserImpl();

        switch (choice) {
            case 1:
                // method to login the user
                System.out.println(userDaoService.login(new User(1,"Corona, Ny")));
                break;
            case 2:
                // method to login the user
                System.out.println(userDaoService.register(new User(3,"Queens NY")));
                break;

        }

    }

    private static void showWelcomeMenu() {
        String message = "Welcome to Food Donation Application\n "
                + "1: Already a member ? Login? \n "
                + "2: Not a member ? Register? \n "
                + "3: Exit App \n ";
        System.out.print(message);
    }
}
