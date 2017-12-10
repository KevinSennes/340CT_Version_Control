/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public class Item {

    //instance variables - declared private because we only want to set them in this class
    private String itemID;
    private String itemName;
    private String itemPrice;
    private String itemQuantity;

    // constructor to create an instance of Item, we pass in the values as parameters and it assigns them to
    // the variables
    public Item(String itemID, String itemName, String itemPrice, String itemQuantity) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    // we need to create public methods so that we can fetch the instance variables from another class
    // we do this instead of making the variables public because it stops us screwing up and accidentally setting
    // the variables to something different from somewhere else
    public String getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }
}