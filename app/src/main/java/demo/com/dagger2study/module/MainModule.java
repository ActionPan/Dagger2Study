package demo.com.dagger2study.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import demo.com.dagger2study.MultiParameter;
import demo.com.dagger2study.view.MainView;

/**
 * Created by action on 16/12/30.
 */

@Module
public class MainModule {
    private final MainView.View mView;
    private Context mContext;
    private MultiParameter mMultiParameter;

    public MainModule(MainView.View view) {
        mView = view;
    }

    @Provides
    MainView.View provideMainView() {
        return mView;
    }

    @Provides
    MultiParameter provideMainView(MultiParameter multiParameter) {
        return new MultiParameter(mContext);
    }

}
