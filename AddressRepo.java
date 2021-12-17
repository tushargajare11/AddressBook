package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressRepo {

    List AddressList = new ArrayList();

    void addAppointment(AddressBook apt)
    {
        AddressList.add(apt);
    }

    List getAppointmentList()
    {
        return AddressList;
    }

}
