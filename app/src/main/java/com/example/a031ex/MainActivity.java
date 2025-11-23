package com.example.a031ex;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Employee> allEmployees = new ArrayList<>();

        allEmployees.add(new HourlyEmployee(1, "ישראל ישראלי", 0, 160, 50));
        allEmployees.add(new HourlyEmployee(2, "Dana Cohen", 0, 120, 45));
        allEmployees.add(new Manager(3, "Amit Levi", 15000, "Marketing", 0.15));
        allEmployees.add(new Salesperson(4, "Lior Ben", 8000, 0.10, 35000));
        allEmployees.add(new Salesperson(5, "Noa Gil", 7000, 0.07, 22000));
    }
}