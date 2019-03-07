package hm.project.hemanttodaytask;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Success extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        tv=findViewById(R.id.textView2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        SharedPreferences sp=getSharedPreferences("hm.project.hemanttodaytask", MODE_PRIVATE);
        String s_user=sp.getString("user", "user");
        tv.setText(s_user);

    }
}
