package ihc.com.br.agendacultural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class eventos extends AppCompatActivity {


    private Button btnevent;
    private Spinner spndias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        btnevent = (Button) findViewById(R.id.btnevent);
        spndias = (Spinner) findViewById(R.id.spndias);
        int posicao = (int) spndias.getSelectedItemId();


        btnevent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int posicao = (int) spndias.getSelectedItemId();
                if(posicao == 0){
                    Toast.makeText(eventos.this, "informe um dia", Toast.LENGTH_SHORT).show();
                } else if(posicao == 1){
                    Intent it = new Intent(eventos.this, D30_11.class);
                    startActivity(it);
                } else {
                    Intent it = new Intent(eventos.this, D17_10.class);
                    startActivity(it);
                }
            }
        });
    }
}