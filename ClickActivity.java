import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.hunting.task1.R;

@SuppressLint("Registered")
public class ClickActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_click= findViewById(R.id.btn_click);
        btn_click.setOnClickListener(new MyOnClickListener());
    }
    class MyOnCllickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btn_click) {
                Toast.makeText(ClickActivity.this, "你好哇", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

