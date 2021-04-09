package com.example.lesson22.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lesson22.ui.home.HomeAdapter.HomeModel;

import java.util.List;

@Dao
public interface FillDao {

    @Query("SELECT * FROM homemodel")
    LiveData<List<HomeModel>> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(HomeModel homeModel);

    @Delete
    void delete(HomeModel homeModel);

    @Update
    void update(HomeModel homeModel);







}
