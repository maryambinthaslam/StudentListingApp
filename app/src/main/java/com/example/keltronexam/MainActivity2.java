package com.example.keltronexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText name, email, year;
    EditText department;
    Button addbtn, displaybtn;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.nameet);
        email = findViewById(R.id.emailet);
        year = findViewById(R.id.yearet);
        department = findViewById(R.id.departmentet);
        addbtn = findViewById(R.id.addbtn);
        displaybtn = findViewById(R.id.displaybtn);

        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = new DBHandler(MainActivity2.this);

        // below line is to add on click listener for our add course button.
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // below line is to get data from all edit text fields.
                String studentName = name.getText().toString();
                String studentEmail = email.getText().toString();
                String admissionYear = year.getText().toString();
                String studentDepartment = department.getText().toString();

                // validating if the text fields are empty or not.
                if (studentName.isEmpty() && studentEmail.isEmpty() && admissionYear.isEmpty() && studentDepartment.isEmpty()) {
                    Toast.makeText(MainActivity2.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                    return;
                }

                // on below line we are calling a method to add new
                // course to sqlite data and pass all our values to it.
                dbHandler.addNewStudent(studentName, studentEmail, admissionYear, studentDepartment);

                // after adding the data we are displaying a toast message.
                Toast.makeText(MainActivity2.this, "Student has been added.", Toast.LENGTH_SHORT).show();
                name.setText("");
                email.setText("");
                year.setText("");
                department.setText("");
            }
        });

        displaybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a new activity via a intent.
                Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(i);
            }
        });
    }
}