package com.example.lesson22.ui.home.HomeAdapter;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class HomeModel implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String number;

//    private DateFormat dateFormat = new SimpleDateFormat("dd MMMM HH : mm");
//    private String date = dateFormat.format(new Date());
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getDate() {
//        return date;

//    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public HomeModel(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
