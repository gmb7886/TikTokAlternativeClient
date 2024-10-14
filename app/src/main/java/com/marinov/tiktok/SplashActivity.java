package com.marinov.tiktok;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Certifique-se de que este layout está criado.

        // Usando um Handler para esperar alguns segundos e depois iniciar a MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finaliza a SplashActivity para que não volte para ela
            }
        }, 500); // Tempo em milissegundos (2 segundos)
    }
}
