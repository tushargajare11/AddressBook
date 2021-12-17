package com.addressbook;

public class AddressBook {

        String firstName;
        String lastName;
        String address1;
        String city,state;
        int zip;
        String phone_number;
        String emailID;

        public String toString()
        {
            return "Address_Book{" +
                    "first_name='" + firstName + '\n' +
                    ", last_name='" + lastName + '\n' +
                    ", address='" + address1 + '\n' +
                    ", city='" + city + '\n' +
                    ", zip=" + zip + '\n' +
                    ", email=" + emailID + '\n' +
                    ", phone_number=" + phone_number + '\n' +
                    '}';
        }




}
