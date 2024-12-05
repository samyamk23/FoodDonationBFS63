package org.food.donation.Model;

/**
 * @Author : Samyam Kafle
 * @Portfolio : https://samyamkafle.com.np
 * @Project : FoodDonation
 * @CreatedDate : 05/12/2024, Thursday
 **/
public class User {
    // properties of users
    private int id;

    public User(int id, String address) {
        this.id = id;
        this.address = address;
    }

    private String address;

    @Override
    public String toString() {
        return "[" +
                "id:" + id +
                ", address:'" + address + '\'' +
                ']';
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
}
