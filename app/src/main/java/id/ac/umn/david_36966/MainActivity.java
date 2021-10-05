package id.ac.umn.david_36966;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import id.ac.umn.david_36966.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        bind.library.setOnClickListener(view -> {
            Intent goToAuth = new Intent(this, LoginActivity.class);
            startActivity(goToAuth);
        });

        bind.profile.setOnClickListener(view -> {
            Intent goToProfile = new Intent(this , ProfileActivity.class);
            goToProfile.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
            this.startActivity(goToProfile);
        });


    }

}
