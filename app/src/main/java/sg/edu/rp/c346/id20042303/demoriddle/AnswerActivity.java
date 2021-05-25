package sg.edu.rp.c346.id20042303.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        tvAnswer = findViewById(R.id.textView);
        Intent intendReceived = getIntent();

        String question = intendReceived.getStringExtra("Question");
        String answer = intendReceived.getStringExtra("Answer");
        tvAnswer.setText(question + " answer is: " + answer);


    }
}