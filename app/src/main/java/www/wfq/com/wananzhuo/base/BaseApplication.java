package www.wfq.com.wananzhuo.base;

import android.app.Application;

public class BaseApplication extends Application {
    private static Application mApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;

    }
    public static Application getApplication(){
        return mApplication;
    }
}
