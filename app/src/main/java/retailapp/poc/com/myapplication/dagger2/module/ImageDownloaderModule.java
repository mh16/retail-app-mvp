package retailapp.poc.com.myapplication.dagger2.module;


import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retailapp.poc.com.myapplication.dagger2.model.ImageDownloader;


@Module
public class ImageDownloaderModule {
    private Context context;

    public ImageDownloaderModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    ImageDownloader provideImageDownloader(Context context) {
        return new ImageDownloader(context);
    }
}
