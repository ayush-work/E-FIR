package com.app.e_fir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FormActivity extends AppCompatActivity {

    EditText repMon,repDay,repYear,repHour,repMin;
    EditText inciMon,inciDay,inciYear,inciHour,inciMin;
    EditText vicFname,vicMname,vicLname;
    EditText inciLoc,inciNature,inciDetails;
    EditText vitFname,vitLname,vitCity,vitState,vitPin,vitCountry,vitAdd,vitPhNumber;
    DatabaseReference reff;
    Victim victim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_layout);

        repMon=(EditText)findViewById(R.id.repMonth);
        repDay=(EditText)findViewById(R.id.repDay);
        repYear=(EditText)findViewById(R.id.repYear);
        repHour=(EditText)findViewById(R.id.repHour);
        repMin=(EditText)findViewById(R.id.repMin);
        final String dor = repMon.getText().toString() +" "+ repDay.getText().toString() +" "+ repHour.getText().toString() + " "+ repMin.getText().toString();

        inciMon=(EditText)findViewById(R.id.inciMon);
        inciDay=(EditText)findViewById(R.id.inciDay);
        inciYear=(EditText)findViewById(R.id.inciYear);
        inciHour=(EditText)findViewById(R.id.inciHour);
        inciMin=(EditText)findViewById(R.id.inciMin);

        inciDetails=(EditText)findViewById(R.id.inciDetails);
        inciNature=(EditText)findViewById(R.id.inciNature);
        inciLoc=(EditText)findViewById(R.id.inciLoc);

        vicFname=(EditText)findViewById(R.id.vicFname);
        vicLname=(EditText)findViewById(R.id.vicLname);
        vicMname=(EditText)findViewById(R.id.vicMname);


        String phNUmber = vitPhNumber.getText().toString();
        vitFname=(EditText)findViewById(R.id.vitFname);
        vitLname=(EditText)findViewById(R.id.vitLname);
        vitCity=(EditText)findViewById(R.id.vitCity);
        vitAdd=(EditText)findViewById(R.id.vitAdd);
        vitState=(EditText)findViewById(R.id.vitState);
        vitCountry=(EditText)findViewById(R.id.vitCountry);
        vitPin=(EditText)findViewById(R.id.vitPin);

        Button button = (Button) findViewById(R.id.button3);
        victim = new Victim();
        reff = FirebaseDatabase.getInstance().getReference().child("Case: ");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                victim.setFname(vicFname);
                victim.setMname(vicMname);
                victim.setLname(vicLname);
                victim.getInciDet(inciDetails);
                victim.getDate(dor);

                reff.push().child("Victim").setValue(victim);
            }
        });

    }
}