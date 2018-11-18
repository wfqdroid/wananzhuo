package www.wfq.com.wananzhuo.home;

import www.wfq.com.wananzhuo.http.BaseObserver;
import www.wfq.com.wananzhuo.http.BasePresenter;

public class HomePresenter extends BasePresenter<IHomeView> {
    public HomePresenter(IHomeView baseView) {
        super(baseView);
    }

    public void fetchData(int page) {
        addDisposable(apiServer.getArticleData(0), new BaseObserver(baseView) {
            @Override
            public void onSuccess(Object o) {
                baseView.onFetchDataSuccess((HomeArticleBean) o);
            }

            @Override
            public void onError(String msg) {
                baseView.showError(msg);
            }
        });
    }
}
