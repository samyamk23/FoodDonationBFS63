package org.food.donation.Impl;

import org.food.donation.Dao.UserDao;
import org.food.donation.Model.Donation;
import org.food.donation.Model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author : Samyam Kafle
 * @Portfolio : https://samyamkafle.com.np
 * @Project : FoodDonation
 * @CreatedDate : 05/12/2024, Thursday
 **/
public class UserImpl implements UserDao {
//    private List<User> users = new ArrayList<>(
//            List.of(new User(1,"Xyz NY"))
//    );
//    private Map<Integer, User> users = new HashMap<>(
//            Map.of(
//                    1, new User(1,"Corona, Ny"),
//                    2, new User(2,"Flushing, Ny")
//            )
//    );
//    private Map<User, List<Donation>> donations = new HashMap<>(
//            Map.of(
//                    new User(1,"xyz"), new ArrayList<>(
//                            List.of(new Donation())
//                    )
//            )
//    );
    @Override
    public User register(User user) {
        // code to register the user
        return user;
    }

    @Override
    public User login(User user) {
        // logic to login the user
//        for (Map.Entry<Integer, User> individualRecord: users.entrySet()) {
//            User currentUser= individualRecord.getValue();
//            if (currentUser.getAddress().equals(user.getAddress())) {
//                donations.get(currentUser);
//                return currentUser;
//            }
//        }
        return null;
    }
}
