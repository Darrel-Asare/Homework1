package lab.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class SecondActivity extends AppCompatActivity {
FloatingActionButton myFab;
private EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

         e1 = (EditText) findViewById(R.id.editText2);
        myFab = (FloatingActionButton) findViewById(R.id.myFab);
        myFab.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                String message = e1.getText().toString();
                intent.putExtra("EXTRA_MESSAGE", message);
                startActivity(intent);
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_quit) {
            finishAndRemoveTask();
        }
        return false;
    }

}
