package www.wfq.com.wananzhuo.http;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import www.wfq.com.wananzhuo.home.HomeArticleBean;

public interface ApiServer {
    @POST("shopping_login.htm")
    Observable<String> LoginByRx(@Field("username") String username, @Field("password") String password);

    @GET(("/article/list/{page}/json"))
    Observable<BaseModel<HomeArticleBean>> getArticleData(@Path("page") int page);
}
