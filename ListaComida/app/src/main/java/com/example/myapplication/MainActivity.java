package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.myapplication.Fragments.ComidaFragment;
import com.example.myapplication.Fragments.SegundoFragment;
import com.example.myapplication.Fragments.TerceiroFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            //Switch pra troca de fragmento
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    trocarFragmento(new ComidaFragment());
                    return true;
                case R.id.navigation_dashboard:
                    trocarFragmento(new SegundoFragment());
                    return true;
                case R.id.navigation_notifications:
                    trocarFragmento(new TerceiroFragment());
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);

        //Abrir o fragmento ComidaFragment ao abrir o app
        trocarFragmento(new ComidaFragment());

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    //Método para troca de fragmento que recebe um fragmento como parametro
    public void trocarFragmento(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.frameConteudo, fragment).commit();
    }

}
