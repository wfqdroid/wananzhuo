package www.wfq.com.wananzhuo.home

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import www.wfq.com.wananzhuo.R

class HomeAdapter : BaseQuickAdapter<HomeArticleBean.DatasBean, BaseViewHolder>(R.layout.item_home) {

    override fun convert(helper: BaseViewHolder, item: HomeArticleBean.DatasBean) {
        helper.setText(R.id.tv_title, item.title)
                .setText(R.id.tv_author,item.author)
                .setText(R.id.tv_time,item.niceDate)
                .setText(R.id.tv_type,item.chapterName)
    }
}
