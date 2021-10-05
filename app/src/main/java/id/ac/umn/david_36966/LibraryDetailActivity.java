package id.ac.umn.david_36966;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Objects;

import id.ac.umn.david_36966.databinding.ActivityLibraryDetailBinding;

public class LibraryDetailActivity extends AppCompatActivity {

    ActivityLibraryDetailBinding bind;
    MediaPlayer media;
    Library item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityLibraryDetailBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        item = getIntent().getExtras().getParcelable("library");

        Objects.requireNonNull(getSupportActionBar()).setTitle(item.getTitle());

        bind.dTitle.setText(item.getTitle());
        bind.dType.setText(item.getType());
        media = new MediaPlayer();
        bind.dPlaySfx.setOnClickListener( v -> {
            media = MediaPlayer.create(this,this.getResources().
                    getIdentifier(item.getSoundURI(),"raw",this.getPackageName()));
            media.start();
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(media.isPlaying()){
            media.release();
            media.release();
            media = null;
        }
    }
}