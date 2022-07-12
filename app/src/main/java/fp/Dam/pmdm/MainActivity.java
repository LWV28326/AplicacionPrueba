package fp.Dam.pmdm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/{

    // ------ TEMA - 1 -------

    //EJERCICIO TRES FORMAS DE PULSAR BOTON
    //COLOCAR BOTON ANCLAR
    //TODOS LOS MËTODOS INTERESANTES DE LA VENTANA

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(getApplicationContext(), "CREATE", Toast.LENGTH_SHORT).show(); //Devuelve el cartelito con mensaje
        Button boton = findViewById(R.id.button);
        //boton.setOnClickListener(this);//paso la clase porque es la que implementa el click listener
        //boton.setOnClickListener(this::botonpulsado);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Has pulsado el boton", Toast.LENGTH_SHORT).show();
            }
        });
    }

   /* private void botonpulsado(View v){
        Toast.makeText(getApplicationContext(), "Has pulsado el boton", Toast.LENGTH_SHORT).show();
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal,menu);
        return true;
    }







    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "START", Toast.LENGTH_SHORT).show(); //Devuelve el cartelito con mensaje
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "RESUME", Toast.LENGTH_SHORT).show(); //Devuelve el cartelito con mensaje
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "PAUSE", Toast.LENGTH_SHORT).show(); //Devuelve el cartelito con mensaje
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "STOP", Toast.LENGTH_SHORT).show(); //Devuelve el cartelito con mensaje
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "RESTART", Toast.LENGTH_SHORT).show(); //Devuelve el cartelito con mensaje
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "DESTROI", Toast.LENGTH_SHORT).show(); //Devuelve el cartelito con mensaje
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.opcion1:
                Toast.makeText(getApplicationContext(), "Opcion 1", Toast.LENGTH_SHORT).show();
                break; //Devuelve el cartelito con mensaje
            case R.id.opcion2:
                Toast.makeText(getApplicationContext(), "Opcion 2", Toast.LENGTH_SHORT).show();
                break; //Devuelve el cartelito con mensaje
        }
        return true;
    }

    /*@Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Has pulsado el boton", Toast.LENGTH_SHORT).show();
    }*/
}