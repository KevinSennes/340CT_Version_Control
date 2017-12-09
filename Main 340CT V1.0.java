package Stock;

/**
 * Stock system example.
 *
 * @author Kevin Sennes
 * @version 0.2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //instance variables
    private boolean exit;

    //an arraylist, but instead of Strings, we're using a new class we've created, called Item
    // that has the variables we want (ID, name, price, quantity)
    ArrayList<Item> stock = new ArrayList<>();

    private String id;
    private String name;
    private String price;
    private String quantity;

    public static void main(String[] args) {

        Main main = new Main();
        main.printHeader();
        main.runMenu();

    }

    public void runMenu() {
        printHeader();
        while (!exit) {
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }


    public void printHeader() {
        System.out.println("Mini-Market");
    }

    public void printMenu() {
        System.out.println("Please make a selection");
        System.out.println("1) Add new stock"); //option 1 adding new stock item
        System.out.println("2) showStockAtPosition"); //show location of stock item
        System.out.println("3) View all stock"); //show all available stock items
        System.out.println("4) Delete stock"); //delete stock item
        System.out.println("0) exit"); //closes program
    }

    public int getInput() {
        Scanner kb = new Scanner(System.in); //scans user choice
        int choice = -1;
        while (choice < 0 || choice > 4) { //options 0-4 only
            try {
                System.out.println("Please enter your choice: ");
                choice = Integer.parseInt(kb.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid Selection, please try again");
            }
        }
        return choice;
    }

    public void performAction(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.print("Thank you for visiting Mini-Market"); //leaving message
                break;
            case 1: //choose 
                addNewItem();
                break;
            case 2:
                showStockAtPosition();
                break;
            case 3:
                showAllStock();
                break;
            case 4:
                deleteStock();
                break;
        }

    }

    public void addNewItem() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter ID Number"); //add ID Number
        id = scan.nextLine();

        System.out.println("Please enter Item Name"); //add Item Name
        name = scan.nextLine();

        System.out.println("Please enter Item Price"); //add item price
        price = scan.nextLine();

        System.out.println("Please enter Item Quantity"); //add quantity question
        quantity = scan.nextLine();

        //now we have the 4 variables assigned, we can create a new Item object, and
        // stick it in the stock array
        Item item = new Item(id, name, price, quantity);

        stock.add(item);
    }

    public void showAllStock() {
         //Going to use a loop to go through any items in the stock array so we
         //don't need to worry about how many are in there!!

        for (int i = 0; i < stock.size(); i++) {
            System.out.println("Stock item in place " + i + " is " + stock.get(i).getItemName());
        }

    }

    public void showStockAtPosition() {
        Scanner reader = new Scanner(System.in); //user input
        System.out.println("Enter an item position: ");
        int position = Integer.parseInt(reader.nextLine());

        try {
            System.out.println("Stock item at that position is:\n" + stock.get(position).getItemName()
                    + "\nID Number:\n" + stock.get(position).getItemID()
                    + "\nItem Price in £:\n" + stock.get(position).getItemPrice()
                    + "\nItem Quantity:\n" + stock.get(position).getItemQuantity());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Sorry, no stock at that position");
        }

    }
}



