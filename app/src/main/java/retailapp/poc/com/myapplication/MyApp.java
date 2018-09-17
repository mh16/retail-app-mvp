package retailapp.poc.com.myapplication;

import android.app.Application;

import retailapp.poc.com.myapplication.dagger2.component.DaggerImageDownloaderComponent;
import retailapp.poc.com.myapplication.dagger2.component.ImageDownloaderComponent;
import retailapp.poc.com.myapplication.dagger2.module.ImageDownloaderModule;


public class MyApp extends Application {
    private static MyApp app;
    private ImageDownloaderComponent imageDownloaderComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        imageDownloaderComponent = DaggerImageDownloaderComponent.builder().imageDownloaderModule(new ImageDownloaderModule(this)).build();
    }

    public static MyApp app(){
        return app;
    }

    public ImageDownloaderComponent getImageDownloaderComponent(){
        return this.imageDownloaderComponent;
    }

}
