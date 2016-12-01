package id.sulistiyanto.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editText1) EditText editText1;
    @BindView(R.id.editText2) EditText editText2;
    @BindView(R.id.txtHasil) TextView txtHasil;

    @OnClick(R.id.button) void jumlah() {
        int angka1 = Integer.parseInt(editText1.getText().toString());
        int angka2 = Integer.parseInt(editText2.getText().toString());
        int jumlah = angka1 + angka2;
        txtHasil.setText("" + jumlah);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
