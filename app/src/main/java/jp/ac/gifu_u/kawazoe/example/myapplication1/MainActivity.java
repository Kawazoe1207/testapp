package jp.ac.gifu_u.kawazoe.example.myapplication1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "アプリを終了しました", Toast.LENGTH_SHORT).show();

                // 少し遅らせて finish() を呼ぶと、Toast が表示される前にアプリが閉じるのを防げます
                b.postDelayed(() -> finish(), 1000); // 1秒後に終了
            }
        });
    }
}
