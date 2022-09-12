package com.example.class4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> myList = new ArrayList<>();
    int currentStudent = 0;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        TextView studentName, studentAge;
        ImageView studentImg;
        Button next;

        studentName = findViewById(R.id.textViewname);
        studentAge = findViewById(R.id.textViewage);
        studentImg = findViewById(R.id.imageView);
        next = findViewById(R.id.button);

        Student s1 = new Student (" Mariam ", 12 , R.drawable.student );
        Student s2 = new Student (" Fay ", 10 , R.drawable.studenttwo );
        Student s3 = new Student (" Ghala ", 13 , R.drawable.studentthree );

        myList.add(s1);
        myList.add(s2);
        myList.add(s3);

        studentName.setText(myList.get(currentStudent).getStudentName());
        studentAge.setText(myList.get(currentStudent).getStudentAge() + "");
        studentImg.setImageResource(myList.get(currentStudent).getStudentImg());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStudent++;
                if(currentStudent == myList.size()) {
                    Toast.makeText(context, "end of list", Toast.LENGTH_LONG).show();
                    currentStudent = 0;
                }
                studentName.setText(myList.get(currentStudent).getStudentName());
                studentAge.setText(myList.get(currentStudent).getStudentAge() + "");
                studentImg.setImageResource(myList.get(currentStudent).getStudentImg());


            }
        });


    }




}

