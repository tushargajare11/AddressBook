package com.addressbook;

import java.util.List;
import java.util.Scanner;

import com.addressbook.Application;
import com.addressbook.UserInterface;



public class Application {

        // TODO Auto-generated method stub
        AddressRepo addressRepo = new AddressRepo();




        Scanner scanner = new Scanner(System.in);

        public static void main(String[] args)
        {
                int exit = 13;
                int option;
                UserInterface userInterface = new UserInterface();
                Application application = new Application();

                do{
                        option = userInterface.ShowMainMenu();
                        application.handleUserSelection(option);
                }while (option != exit);
        }
        void handleUserSelection(int option)
        {
                UserInterface userInterface = new UserInterface();
                switch (option)
                {
                        case 1:
                                addAddress();
                                break;
                        case 2:
                                break;
                        case 3:
                                break;
                        default:
                                System.out.println("Wrong Option..!");
                                break;



                }

        }


        public    void addAddress()
        {
                AddressBook address = new AddressBook();

                System.out.println("Enter first Name :");
                address.firstName = scanner.nextLine();

                System.out.println("Enter last Name :");
                address.lastName = scanner.nextLine();

                System.out.println("Enter  Email ID :");
                address.emailID = scanner.nextLine();

                System.out.println("Enter city  :");
                address.city = scanner.nextLine();


                System.out.println("Enter state  :");
                address.state = scanner.next();

                System.out.println("Enter Mobile Name :");
                address.phone_number = scanner.next();


                System.out.println("Enter address :");
                address.address1 = scanner.next();


                System.out.println("Enter zip number :");
                address.zip = scanner.nextInt();


        }
}