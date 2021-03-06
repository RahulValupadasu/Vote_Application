package com.example.vote_application;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import java.util.HashMap;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.Map;

public class Vote  extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ToggleButton toggle;
    Button vote;
    int[] val1 = {0, 1, 2, 3};
    Spinner spinner_dpdown;
    TextView textView1;
    Number count =0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);
        toggle = findViewById(R.id.toggle);
        vote = findViewById(R.id.vote);
        EditText name = findViewById(R.id.name_id);
        EditText id = findViewById(R.id.id_id);







        textView1 = (TextView) findViewById(R.id.text1);
        spinner_dpdown = (Spinner) findViewById(R.id.candidate_drop_down_spinner);
        ArrayAdapter<CharSequence> adapter1 =
                ArrayAdapter.createFromResource(Vote.this, R.array.candidate_drop_down, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_dpdown.setAdapter(adapter1);
        spinner_dpdown.setOnItemSelectedListener(this);



        vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("name",""+name.getText().toString());
                if (toggle.isChecked()) {

                } else {
                    Toast.makeText(Vote.this, "Please accept terms and conditions", Toast.LENGTH_LONG).show();
                }

                if(name.getText().toString()==null || id.getText().toString()==null){
                    Toast.makeText(Vote.this,"Please fill name and id fields",Toast.LENGTH_LONG).show();
                }

            }
        });

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String candiate_selected = parent.getItemAtPosition(position).toString();
        Log.i("selected Item ",""+candiate_selected);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}



