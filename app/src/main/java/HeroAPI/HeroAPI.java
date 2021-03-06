package HeroAPI;

import java.util.List;
import java.util.Map;

import model.Heroesmodel;
import model.ImageResponse;
import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface HeroAPI {

    @FormUrlEncoded
    @POST("heroes")
    Call<Void> addHero(@Field("name") String name,@Field("desc") String desc);

    //Using Fieldmap
 @FormUrlEncoded
            @POST("heroes")
    Call<Void> addHero(@FieldMap Map<String,String> map);

 @Multipart
    @POST("upload")
    Call<ImageResponse> uploadingImage(@Part MultipartBody.Part img);

 @GET("heroes")
    Call<List<Heroesmodel>> getAllHeroes();
}
