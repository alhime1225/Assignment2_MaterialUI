package com.example.materiaui_assignment2.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.materiaui_assignment2.entity.User;

import java.util.List;

//TODO 2. Create a Dao file which needs to be an interface
/*
    Dao basically provides methods that the app can use to interact with the data.
    For instance, if you want to add, update, delete or query the database.

    So if you've used SQL, you'd be familiar with the queries such as:
    -SELECT * FROM Customers;
    -DELETE FROM table_name WHERE condition;
    -UPDATE table_name
     SET column1 = value1, column2 = value2, ...
     WHERE condition;

     etc. Basically, DAO can provide such capabilities
 */
@Dao
public interface UserDao {
    //Getting all the data
    @Query("SELECT * FROM user")
    List<User> getAll();

    //Inserting data in the User class. You should have noticed that after the User, there's 3 dots "..." right next to it, this implies that its multiple entries, an array
    @Insert
    void insertAll(User... users);
}
