package cl.bootcamp.registrousuario;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextLastName, editTextEmail, editTextPass;
    private Button buttonSubmit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enlazamos las vistas
        editTextName = findViewById(R.id.edit_text_name);
        editTextLastName = findViewById(R.id.edit_text_last_name);
        editTextEmail = findViewById(R.id.edit_text_email);
        buttonSubmit = findViewById(R.id.button_submit);
        editTextPass = findViewById(R.id.edit_text_pass);

        // Configuramos el listener para el botón de enviar
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtenemos los valores ingresados por el usuario
                String name = editTextName.getText().toString();
                String lastName = editTextLastName.getText().toString();
                String email = editTextEmail.getText().toString();
                String pass = editTextPass.getText().toString();

                // Validamos que los campos no estén vacíos
                if (TextUtils.isEmpty(name) || TextUtils.isEmpty(lastName) || TextUtils.isEmpty(email) || TextUtils.isEmpty(pass)) {
                    Toast.makeText(MainActivity.this, "Por favor complete todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Si están completos, mostramos el mensaje de bienvenida
                    String welcomeMessage =  "¡Hola " + name +
                            " " + lastName +" "+ "Email: " + email  +" "+
                            "Contraseña: " + pass;
                    Toast.makeText(MainActivity.this, welcomeMessage, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
