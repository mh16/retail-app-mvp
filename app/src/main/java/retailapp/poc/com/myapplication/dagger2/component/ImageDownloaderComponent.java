package retailapp.poc.com.myapplication.dagger2.component;

import javax.inject.Singleton;

import dagger.Component;
import retailapp.poc.com.myapplication.dagger2.DaggerMainActivity;
import retailapp.poc.com.myapplication.dagger2.module.ImageDownloaderModule;


@Singleton
@Component(modules = ImageDownloaderModule.class)
public interface ImageDownloaderComponent {
    void inject(DaggerMainActivity mainActivity);
}
