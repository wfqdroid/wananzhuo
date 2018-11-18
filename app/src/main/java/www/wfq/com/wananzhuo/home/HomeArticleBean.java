package www.wfq.com.wananzhuo.home;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HomeArticleBean {

    /**
     * curPage : 2
     * datas : [{"apkLink":"","author":"MRYangY","chapterId":401,"chapterName":"二维码","collect":false,"courseId":13,"desc":"一款仿微信扫一扫界面，基于zxing实现的扫码库。","envelopePic":"http://wanandroid.com/blogimgs/0554900d-e606-47e3-bd37-3558f18523e8.png","fresh":false,"id":7472,"link":"http://www.wanandroid.com/blog/show/2415","niceDate":"2018-11-06","origin":"","projectLink":"https://github.com/MRYangY/YZxing","publishTime":1541507591000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=401"}],"title":"Android 基于Zxing的扫码功能实现","type":0,"userId":-1,"visible":1,"zan":0}]
     * offset : 20
     * over : false
     * pageCount : 285
     * size : 20
     * total : 5683
     */

    @SerializedName("curPage")
    private int curPage;
    @SerializedName("offset")
    private int offset;
    @SerializedName("over")
    private boolean over;
    @SerializedName("pageCount")
    private int pageCount;
    @SerializedName("size")
    private int size;
    @SerializedName("total")
    private int total;
    @SerializedName("datas")
    private List<DatasBean> datas;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * apkLink :
         * author : MRYangY
         * chapterId : 401
         * chapterName : 二维码
         * collect : false
         * courseId : 13
         * desc : 一款仿微信扫一扫界面，基于zxing实现的扫码库。
         * envelopePic : http://wanandroid.com/blogimgs/0554900d-e606-47e3-bd37-3558f18523e8.png
         * fresh : false
         * id : 7472
         * link : http://www.wanandroid.com/blog/show/2415
         * niceDate : 2018-11-06
         * origin :
         * projectLink : https://github.com/MRYangY/YZxing
         * publishTime : 1541507591000
         * superChapterId : 294
         * superChapterName : 开源项目主Tab
         * tags : [{"name":"项目","url":"/project/list/1?cid=401"}]
         * title : Android 基于Zxing的扫码功能实现
         * type : 0
         * userId : -1
         * visible : 1
         * zan : 0
         */

        @SerializedName("apkLink")
        private String apkLink;
        @SerializedName("author")
        private String author;
        @SerializedName("chapterId")
        private int chapterId;
        @SerializedName("chapterName")
        private String chapterName;
        @SerializedName("collect")
        private boolean collect;
        @SerializedName("courseId")
        private int courseId;
        @SerializedName("desc")
        private String desc;
        @SerializedName("envelopePic")
        private String envelopePic;
        @SerializedName("fresh")
        private boolean fresh;
        @SerializedName("id")
        private int id;
        @SerializedName("link")
        private String link;
        @SerializedName("niceDate")
        private String niceDate;
        @SerializedName("origin")
        private String origin;
        @SerializedName("projectLink")
        private String projectLink;
        @SerializedName("publishTime")
        private long publishTime;
        @SerializedName("superChapterId")
        private int superChapterId;
        @SerializedName("superChapterName")
        private String superChapterName;
        @SerializedName("title")
        private String title;
        @SerializedName("type")
        private int type;
        @SerializedName("userId")
        private int userId;
        @SerializedName("visible")
        private int visible;
        @SerializedName("zan")
        private int zan;
        @SerializedName("tags")
        private List<TagsBean> tags;

        public String getApkLink() {
            return apkLink;
        }

        public void setApkLink(String apkLink) {
            this.apkLink = apkLink;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getChapterId() {
            return chapterId;
        }

        public void setChapterId(int chapterId) {
            this.chapterId = chapterId;
        }

        public String getChapterName() {
            return chapterName;
        }

        public void setChapterName(String chapterName) {
            this.chapterName = chapterName;
        }

        public boolean isCollect() {
            return collect;
        }

        public void setCollect(boolean collect) {
            this.collect = collect;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getEnvelopePic() {
            return envelopePic;
        }

        public void setEnvelopePic(String envelopePic) {
            this.envelopePic = envelopePic;
        }

        public boolean isFresh() {
            return fresh;
        }

        public void setFresh(boolean fresh) {
            this.fresh = fresh;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getNiceDate() {
            return niceDate;
        }

        public void setNiceDate(String niceDate) {
            this.niceDate = niceDate;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getProjectLink() {
            return projectLink;
        }

        public void setProjectLink(String projectLink) {
            this.projectLink = projectLink;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public int getSuperChapterId() {
            return superChapterId;
        }

        public void setSuperChapterId(int superChapterId) {
            this.superChapterId = superChapterId;
        }

        public String getSuperChapterName() {
            return superChapterName;
        }

        public void setSuperChapterName(String superChapterName) {
            this.superChapterName = superChapterName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getVisible() {
            return visible;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public int getZan() {
            return zan;
        }

        public void setZan(int zan) {
            this.zan = zan;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public static class TagsBean {
            /**
             * name : 项目
             * url : /project/list/1?cid=401
             */

            @SerializedName("name")
            private String name;
            @SerializedName("url")
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
