package demo.com.dagger2study.presenter;

import javax.inject.Inject;

import demo.com.dagger2study.view.MainView;

/**
 * Created by action on 16/12/30.
 */

public class MainPersenter {

    //MainContract是个接口，View是他的内部接口，这里看做View接口即可
    private MainView.View mView;

    @Inject
    MainPersenter(MainView.View view) {
        mView = view;
    }

    public void loadData() {
        //调用model层方法，加载数据

        //回调方法成功时
        mView.updateUI();
    }
}
