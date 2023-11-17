package com.example.textscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private boolean editable=false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button1);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addComment();
            }
        });
}
    private void addComment(){
        EditText text =(EditText) findViewById(R.id.article);

        if(!editable){
            text.setFocusable(true);
            text.setTextIsSelectable(true);
            mButton.setText("Save comment");
            editable=true;

        }
        else{
            text.setFocusable(false);
            text.setTextIsSelectable(false);
            mButton.setText("Add comment");
            editable=false;

        }
    }
}