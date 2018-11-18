package www.wfq.com.wananzhuo.home;

import www.wfq.com.wananzhuo.http.BaseView;

public interface IHomeView extends BaseView {
    void onFetchDataSuccess(HomeArticleBean bean);
}
