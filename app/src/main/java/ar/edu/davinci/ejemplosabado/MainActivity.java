package ar.edu.davinci.ejemplosabado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

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
            public void onClick(View view) {
                TextView contentTitle = findViewById(R.id.contentTitle);
                contentTitle.setText(R.string.contentButtonTextOnClick);
                contentTitle.setBackgroundColor(+R.color.red_500);
            }
        });

    }
}