package erikseytijohansson.aula2003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
    }

    public void calcularIMC (View view)
    {
        EditText editKilo = (EditText)findViewById(R.id.editKilo);
        EditText editAltura = (EditText)findViewById(R.id.editAltura);

        Double kilo = Double.parseDouble(editKilo.getText().toString());
        Double altura = Double.parseDouble(editKilo.getText().toString());

        Double resultado = (kilo/(altura*altura));

        Toast.makeText(this,"A soma é "+ resultado,Toast.LENGTH_LONG).show();

    }
}
