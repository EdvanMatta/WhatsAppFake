package aprendabrincando.edvanmatta.com.whatsappfake.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import aprendabrincando.edvanmatta.com.whatsappfake.R;

public class ValidadorActivity extends AppCompatActivity {

    private EditText codValidar;
    private Button botaoVaidacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validador);

        codValidar = (EditText) findViewById(R.id.text_cod_validacao_id);
        botaoVaidacao = (Button) findViewById(R.id.botao_validacao_id);
    }
}
