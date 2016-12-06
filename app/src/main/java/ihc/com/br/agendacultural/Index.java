package ihc.com.br.agendacultural;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Index extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);


        final Button btninit = (Button) findViewById(R.id.btninit);
        btninit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Index.this, eventos.class);
                startActivity(it);
                finish();
            }
        });
    }
}
