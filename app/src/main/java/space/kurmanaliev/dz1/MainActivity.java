package space.kurmanaliev.dz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected EditText title, password;
    protected Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // инициализация между вьюшками,
        title = findViewById(R.id.edit_title);
        password = findViewById(R.id.edit_password);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (title.getText().toString().trim().equals("Kairat") && password.getText().toString().trim().equals("golden")) {
                    Toast.makeText(MainActivity.this, "Добро пожаловать, " + title.getText().toString(), Toast.LENGTH_SHORT).show();
                }

                else {
                    title.setError("Вы ввели неправильное имя!");
                    password.setError("Вы ввели неправильный пароль!");
                }
            }
        });


    }
}