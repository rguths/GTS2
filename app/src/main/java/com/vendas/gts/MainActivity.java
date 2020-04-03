package com.vendas.gts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.men_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuCadastrarVenda :
                Toast.makeText(MainActivity.this, "Tem que abrir tela VENDA", Toast.LENGTH_LONG).show();
                break;
            case R.id.menuCadastrarCliente :
                Toast.makeText(MainActivity.this, "Tem que abrir tela NovoCliente", Toast.LENGTH_LONG).show();
                setContentView(R.layout.activity_cliente);
                break;
            case R.id.menuEnviarDado:
                Toast.makeText(MainActivity.this, "Tem que disparar ação de envio dos dados", Toast.LENGTH_LONG).show();
                break;


        }

        return super.onOptionsItemSelected(item);
    }
}
