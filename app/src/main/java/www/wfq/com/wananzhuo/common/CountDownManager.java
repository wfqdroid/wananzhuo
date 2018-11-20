package www.wfq.com.wananzhuo.common;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class CountDownManager {
    private CountDownManager() {
    }

    private static class Holder {
        private static final CountDownManager instance = new CountDownManager();

    }

    public static CountDownManager getInstance() {
        return Holder.instance;
    }

    DisposableObserver disposableObserver;

    @SuppressLint("CheckResult")
    public CountDownManager startCountDown(@NonNull int time) {

        disposableObserver = Observable.interval(1, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .take(time)
                .map(aLong -> time - aLong)
                .subscribeWith(new DisposableObserver<Long>() {
                    @Override
                    public void onNext(Long aLong) {
                        if (callback != null)
                            callback.onNext(aLong.intValue());
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onComplete() {
                        if (callback != null)
                            callback.onComplete();
                    }
                });

        return this;

    }

    private callback callback;

    public void setCallback(CountDownManager.callback callback) {
        this.callback = callback;
    }

    public void cacelCallback() {
        if (null != disposableObserver && !disposableObserver.isDisposed()) {
            disposableObserver.dispose();
        }

    }

    public interface callback {
        void onNext(int time);

        void onComplete();
    }
}
