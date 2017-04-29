package aprendabrincando.edvanmatta.com.whatsappfake.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.github.rtoshiro.util.format.MaskFormatter;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

import aprendabrincando.edvanmatta.com.whatsappfake.R;

public class LoginActivity extends AppCompatActivity {

    private EditText codigoPais;
    private EditText codigoArea;
    private EditText telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        codigoPais = (EditText) findViewById(R.id.text_cod_pais_id);
        codigoArea = (EditText) findViewById(R.id.text_cod_area_id);
        telefone = (EditText) findViewById(R.id.text_nome_id);

        //Define Mascaras
        SimpleMaskFormatter smfCodPais = new SimpleMaskFormatter("+NN");
        SimpleMaskFormatter smfCodArea = new SimpleMaskFormatter("NN");
        SimpleMaskFormatter smfTelefone = new SimpleMaskFormatter("NNNNN-NNNN");

        MaskTextWatcher mtwCodPais = new MaskTextWatcher(codigoPais, smfCodPais);
        MaskTextWatcher mtwCodArea = new MaskTextWatcher(codigoArea, smfCodArea);
        MaskTextWatcher mtwTelefone = new MaskTextWatcher(telefone, smfTelefone);

        codigoPais.addTextChangedListener(mtwCodPais);
        codigoArea.addTextChangedListener(mtwCodArea);
        telefone.addTextChangedListener(mtwTelefone);
    }
}
