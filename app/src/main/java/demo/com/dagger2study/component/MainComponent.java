package demo.com.dagger2study.component;

import dagger.Component;
import demo.com.dagger2study.MainActivity;
import demo.com.dagger2study.module.MainModule;

/**
 * Created by action on 16/12/30.
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
