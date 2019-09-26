package com.example.mymessages;

import android.app.Person;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    static List<Message> getList () {
        List<Message> people = new ArrayList<>();
        people.add(new Message("Rihanna ", "Hey Baby", "", "11:30pm"));
        people.add(new Message("Kashcoming", "Controlla is a jam bro", "", "10:00pm"));
        people.add(new Message("City Girl", "Cashapp me some money if you wanna take me out. ", "", "9:45pm"));
        people.add(new Message("Dangote", "The wire transfer of 500k has been approved. Check you bank acct.", "", "9:30pm"));
        people.add(new Message("Davido", "A good time is the name of the album", "", "7:25pm"));
        people.add(new Message("Naira", "Ninu aye, Inside life! ", "", "6:30pm"));
        people.add(new Message("Keke", "Do you love me", "", "5:00pm"));
        people.add(new Message("Burna", "Wagwan my brudda", "", "4:30pm"));
        people.add(new Message("Tarm", "Halis on me droppin soon!", "", "2:20pm"));
        people.add(new Message("Devon", "Where the jawns at bro", "", "1:00pm"));

        return people;
    }

}
