package id.ac.umn.david_36966;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import id.ac.umn.david_36966.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        bind.next.setOnClickListener(view -> {
            String name = bind.name.getText().toString();
            if(name.isEmpty())
                bind.name.setError("Harap Di-isi");
            else{
                Intent intent = new Intent(this, LibraryActivity.class);
                intent.putExtra("name", bind.name.getText().toString());
                startActivity(intent);
            }
        });
    }
}
