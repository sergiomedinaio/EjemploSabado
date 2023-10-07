package ar.edu.davinci.ejemplosabado;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button contentButton = new Button(this);
        contentButton.setText(R.string.contentButtonText);

        LinearLayout content = findViewById(R.id.content);
        content.addView(contentButton);

        contentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button) {
                ArrayList listaDeTextos = new ArrayList();
                listaDeTextos.add("Texto 1");
                listaDeTextos.add("Otro texto");
                listaDeTextos.add("Más texto");
                listaDeTextos.add("Mucho más texto");
                listaDeTextos.add("Muchísimo texto");

                int numeroAleatorio = (int) (Math.random() * 5);
                String textoAleatorio = (String) listaDeTextos.get(numeroAleatorio);

                CharSequence msg = "Estado actualizado";
                //button.getContext() devuelve el MainActivity
                Toast toast = Toast.makeText(button.getContext(), msg, Toast.LENGTH_SHORT);
                toast.show();

                TextView newText = new TextView(button.getContext());
                newText.setText(textoAleatorio);

                LinearLayout appContent = findViewById(R.id.appContent);
                appContent.addView(newText);
            }
        });

    }
}