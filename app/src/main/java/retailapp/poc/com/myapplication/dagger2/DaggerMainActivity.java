package retailapp.poc.com.myapplication.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import javax.inject.Inject;


import retailapp.poc.com.myapplication.MyApp;
import retailapp.poc.com.myapplication.R;
import retailapp.poc.com.myapplication.dagger2.model.ImageDownloader;

public class DaggerMainActivity extends AppCompatActivity {
    @Inject
    ImageDownloader downloader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);

        MyApp.app().getImageDownloaderComponent().inject(this);

        ImageView imageView = findViewById(R.id.main_image);
        downloader.toImageView(imageView, "https://thumbs.dreamstime" +
                ".com/z/woman-hand-holding-phone-online-shopping-36188900.jpg");
    }
}