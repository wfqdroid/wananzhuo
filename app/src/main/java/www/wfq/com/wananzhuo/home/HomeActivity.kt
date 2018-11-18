package www.wfq.com.wananzhuo.home

import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_home.*
import www.wfq.com.wananzhuo.R
import www.wfq.com.wananzhuo.http.BaseActivity

class HomeActivity : BaseActivity<HomePresenter>(), IHomeView {
    override fun createPresenter(): HomePresenter {
        return HomePresenter(this)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_home
    }

    override fun onFetchDataSuccess(bean: HomeArticleBean?) {
        bean ?: return
        mAdapter.setNewData(bean.datas)
    }
    var mAdapter = HomeAdapter()
    override fun initView() {
        super.initView()
        presenter.fetchData(0)
        recyclerview?.let {
            it.layoutManager = LinearLayoutManager(this)
            it.adapter = mAdapter
        }

    }
}