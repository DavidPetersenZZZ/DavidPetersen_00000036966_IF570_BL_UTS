package id.ac.umn.david_36966;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

import id.ac.umn.david_36966.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {

    ActivityProfileBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());
        Objects.requireNonNull(getSupportActionBar()).setTitle("Profile");

    }
}
