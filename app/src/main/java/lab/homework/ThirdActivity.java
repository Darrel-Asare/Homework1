package lab.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    Button btn_Return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");

        TextView textView = findViewById(R.id.textView3);
        textView.setText(message);

        btn_Return = (Button)findViewById(R.id.btn_Return);

        btn_Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}
