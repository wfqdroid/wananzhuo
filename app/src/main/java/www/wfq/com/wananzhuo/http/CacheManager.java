package www.wfq.com.wananzhuo.http;

import android.os.Environment;
import www.wfq.com.wananzhuo.base.BaseApplication;

import java.io.File;

/**
 * 单例模式 获取缓存的路径
 */
public class CacheManager {
    private CacheManager (){}
    private static class Holder{
        private static final CacheManager instance = new CacheManager();
    }
    public static CacheManager getInstance(){
        return Holder.instance;
    }

    public File getCacheFile(){
        String cachePath;
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())
                || !Environment.isExternalStorageRemovable()) {
            cachePath = BaseApplication.getApplication().getExternalCacheDir().getPath();
        } else {
            cachePath = BaseApplication.getApplication().getCacheDir().getPath();
        }
        return new File(cachePath + File.separator + "netcache");
    }
}
