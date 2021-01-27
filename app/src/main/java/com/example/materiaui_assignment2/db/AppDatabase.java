package com.example.materiaui_assignment2.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.materiaui_assignment2.dao.UserDao;
import com.example.materiaui_assignment2.entity.User;

//TODO 3. Create a database object
/*
    Defines the database configuration and serve's as the app's main access point to the persisted data.

    In creating this database class, you always have to specify the following: annotation, entities (array the lists all data entities associated with
    the database) and the version.

    You also need to make sure that the class is abstract (declared before the "class" keyword)

    "For each DAO class that is associated with the database, the database class must define an abstract method that has zero arguments and returns an instance of the DAO class"
    -Meaning, every Dao needs to be defined as abstract as you can see in line #23
 */
@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
    private static  AppDatabase appDB;

    //TODO 5. Build the database
    /*
        Accessing the database and trying to catch an error. In here we're saying that if the database is empty then build the database,
        otherwise, return the database itself.
     */
    public static AppDatabase getDB(Context context ){

        if(appDB== null){
            appDB = buildDB(context);
        }

        return  appDB;
    }

    //TODO 4. Create an instance of the database object and use .build()
    /*
        After you have defined the data entity, the DAO, and the database object, you can use the following code to create an instance of the database:

         AppDatabase db = Room.databaseBuilder(getApplicationContext(),
            AppDatabase.class, "database-name").build();

            - However, by doing this, you will encounter an error with the getApplicationContext(), so to resolve this issue, you will need to create
            a method that will take in Context as a parameter and return it as a Room.databaseBuilder. You will also need to add .allowMainThreadQueries()
            to allow the thread to run in the UI.
     */
    private static AppDatabase buildDB(Context context){
        return Room.databaseBuilder(context, AppDatabase.class,"user-db")
                .allowMainThreadQueries().build();
    }
}
