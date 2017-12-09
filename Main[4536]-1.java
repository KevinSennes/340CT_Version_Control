package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    boolean exit;
    ArrayList<String> array1 = new ArrayList<String>();
    ArrayList<String> array2 = new ArrayList<String>();
    ArrayList<String> array3 = new ArrayList<~>();
    ArrayList<String> array4 = new Arraylist<~>(); //quantity

    String item;
    String price;
    String ID;
    String quantity;
    public static void main(String[] args) {

        Main main = new Main();
        main.printHeader();
        main.runMenu();

    }

    public void runMenu(){
        printHeader();
        while(!exit){
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    public void printHeader(){
        System.out.println("KEVINS SHOP");
    }

    public void printMenu(){
        System.out.println("Please make a selection");
        System.out.println("1) Add new stock");
        System.out.println("2) showStockForDemo");
        System.out.println("3) View all stock");
        System.out.println("0) exit");
    }

    public int getInput(){
        Scanner kb = new Scanner(System.in);
        int choice = -1;
        while(choice < 0 || choice > 3){
            try {
                System.out.println("Please enter your choice: ");
                choice = Integer.parseInt(kb.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Invalid Selection, please try again");
            }
        }
        return choice;
    }

    public void performAction(int choice){
        switch (choice){
            case 0:
                exit = true;
                System.out.print("Thank you for visiting Kevs shop");
                break;
            case 1:
                addNewItem();
                break;
            case 2:
                showStock();
                break;
            case 3:
                break;
        }

    }

    public  void addNewItem(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter ID Number");
        ID =  scan.nextLine();
        array1.add(0, ID);
        System.out.println("Please enter Item Name");
        item  =  scan.nextLine();
        array2.add(0, item);
        System.out.println("Please enter Item Price");
        price =  scan.nextLine();
        array3.add(0, price);
        System.out.println("Please enter Item Quantity"); // added quantity question
        quantity =  scan.nextLine();
        array4.add(0, quantity);
    }

    public void showStock(){
        System.out.println("First Item is: ");
        String str = array1.get(0);
        System.out.println(str);
        String str2 = array2.get(0);
        System.out.println(str2);
        String str3 = array3.get(0);
        System.out.println(str3);
        System str4 = array4.get(0);
        System.out.println(str4);
    }

    private ArrayList<String> _categories; //options with array e.g. apples

    private int getCategoryPos(String category) { //position in array
        return _category.indexOf(category);//indexof method of getting index of arraylist
    }

    Scanner reader = new Scanner(System.in); //user input maybe
    System.out.println("Enter a number: ");
    int n = reader.nextInt(); //scans intput as an int (changing it to nextString instead)
    reader.close()


}
