package demo.com.dagger2study;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by action on 17/1/3.
 */

public class MultiParameter {

    private Context mContext;

    @Inject
    public MultiParameter(Context context){
        mContext = context;
    }
}
