package demo.com.dagger2study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import demo.com.dagger2study.component.DaggerMainComponent;
import demo.com.dagger2study.module.MainModule;
import demo.com.dagger2study.presenter.MainPersenter;
import demo.com.dagger2study.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView.View{

    @Inject
    MainPersenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .mainModule(new MainModule(this))
                .build()
                .inject(this);

        //调用Presenter方法加载数据
        mainPresenter.loadData();
    }

    @Override
    public void updateUI() {

    }

}
