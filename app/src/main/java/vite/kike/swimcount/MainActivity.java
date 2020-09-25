package vite.kike.swimcount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int contador = 0;
    long tempsEspera = 5000;
    long t0 = System.currentTimeMillis();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        btn.setText(String.valueOf(contador));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (potAugmentar()) {
                    augmenta();
                }
            }
        });
    }

    private boolean potAugmentar() {
        return System.currentTimeMillis() - t0 > tempsEspera;
    }

    void augmenta() {
        contador++;
        btn.setText(String.valueOf(contador));
        t0 = System.currentTimeMillis();
    }
}