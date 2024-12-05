package org.food.donation.Dao;

import org.food.donation.Model.User;

/**
 * @Author : Samyam Kafle
 * @Portfolio : https://samyamkafle.com.np
 * @Project : FoodDonation
 * @CreatedDate : 05/12/2024, Thursday
 **/
public interface UserDao {
//    rule set for registering, logging in, updating profiles, etc
    User register(User user);
    User login(User user);
}
