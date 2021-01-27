package com.example.materiaui_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Person;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.example.materiaui_assignment2.dao.UserDao;
import com.example.materiaui_assignment2.db.AppDatabase;
import com.example.materiaui_assignment2.entity.User;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /*
    To create a database, you will need to create an Entity, Dao and Database. Follow the TODO's
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void datePicker(View view){

        TextInputEditText bday = findViewById(R.id.txtBirthday);
        final Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,
                                          int monthOfYear, int dayOfMonth) {
                        bday.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }

    public void onSaveAction(View view){
        User user = new User();

        //TODO 6. Access the database and retrieve the data
        AppDatabase db = AppDatabase.getDB(getApplicationContext());
        UserDao userDao = db.userDao();

        userDao.insertAll(user);
        List<User> users = userDao.getAll();
    }


}