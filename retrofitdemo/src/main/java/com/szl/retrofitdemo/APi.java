package com.szl.retrofitdemo;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @ explain:
 * @ author：xujun on 2016-8-25 15:06
 * @ email：gdutxiaoxu@163.com
 */
public interface APi {

    @Headers({"apikey:81bf9da930c7f9825a3c3383f1d8d766" ,"Content-Type:application/json"})
    @GET("world/world")
    Call<News> getNews(@Query("num") String num,@Query("page")String page);

    @FormUrlEncoded
    @Headers({"apikey:81bf9da930c7f9825a3c3383f1d8d766" ,"Content-Type:application/json"})
    @POST("world/world")
    Call<News> postNews(@Field("num") String num, @Field("page")String page);

    @Headers({"apikey:81bf9da930c7f9825a3c3383f1d8d766" ,"Content-Type:application/json"})
    @GET("{type}/{type}")
    Call<News> tiYu(@Path("type") String type, @Query("num") String num,@Query("page")String page);

    @Headers({"apikey:81bf9da930c7f9825a3c3383f1d8d766" ,"Content-Type:application/json"})
    @GET("{type1}/{type2}")
    Call<News> tiYu(@Path("type1") String type1,@Path("type2") String type2,  @Query("num") String num,@Query("page")String page);

    @FormUrlEncoded
    @Headers({"apikey:81bf9da930c7f9825a3c3383f1d8d766" ,"Content-Type:application/json"})
    @POST("keji/keji")
    Call<News> keji(@Query("num") String num,@Query("page")String page);

}
