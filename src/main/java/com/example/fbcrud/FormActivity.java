package com.example.fbcrud;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FormActivity extends AppCompatActivity {
    private EditText editName, editAge,editStatus;
    private Button btnSubmit;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference = database.getReference("users");

    void initUI(){
        editName = findViewById(R.id.edit_name);
        editAge = findViewById(R.id.edit_age);
        editStatus = findViewById(R.id.edit_status);
        btnSubmit = findViewById(R.id.btn_submit);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        initUI();

        btnSubmit.setOnClickListener(view -> {
            String key = reference.push().getKey();
            User user = new User(key,
                    editName.getText().toString(),editStatus.getText().toString(),
                    Integer.parseInt(editAge.getText().toString()));
            reference.child(user.getKey()).setValue(user)   ;
            onBackPressed();
        });
    }
}
