package fp.Dam.pmdm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/{

    // ------ VIDEO - 1 -------
    //EJERCICIO TRES FORMAS DE PULSAR BOTON
    //COLOCAR BOTON ANCLAR
    //TODOS LOS MËTODOS INTERESANTES DE LA VENTANA

    //-------VIDEO - 2 ----------------------------------------- Tema - 3
    //Recuperar info cuando está en segundo plano
    //Se ejecuta un método antes del pause -- onSave

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Objeto que sirve para recupear el estado de la activity en una circusncia muy concreta
        // En caso de ir para atrás o cerrar no puedo usar ese mecanismo de recuperación
        //Solamente cuando pasa a segundo plano, cuando abro otra aplicacion y queda en pause
        //el obejto Bundle es null
        //Si quiero guardar el estado usar otros métodos -- ya los veremos
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

    /*
   Método que se ejecuta despues del método onPause
   Sirve para guardar cualquier cosa de l activity, el estado
   Uso el objeto outState
    */
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) { //Es un contenedor como un mapa, puedo meter culaquier dato
        Toast.makeText(getApplicationContext(), "SAVE INSTANCE", Toast.LENGTH_SHORT).show(); //Devuelve el cartelito con mensaje
        outState.putString("nombre", ((EditText) findViewById(R.id.editNombre)).getText().toString());//Clave -- dato guardado en editNombre, en el cuadro de texto
        //Me retorna cualquier cosa por eso hago un cast
        //invoco metodo toString para guardar cadena de texto, salvo el estado de mi actividad
        super.onSaveInstanceState(outState);
    }

    /*
    Metodo para retornar, recuperar lo anterior, en caso de destruir la aplicacion -- aparecería el cartel destroy
    Esto se puede hacer en el create, es lo más normal y no usar este método -- pero hay problema el objeto es null entonces hay que usar otros métodos, que ya los veremos
    //--- No funciona en el emulador, en el móvil probarlo:
         - hay una opción que habría que activar -- interrumpir actividades , el android cada vez quue lleve una activudad a segundo plano la destruyr
         entonces si funciona
     */
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        ((EditText) findViewById(R.id.editNombre)).setText(savedInstanceState.getString("nombre"));
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