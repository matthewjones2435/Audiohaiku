package io.github.matthewjones2435.audiohaiku.service;

import io.github.matthewjones2435.audiohaiku.BuildConfig;
import io.github.matthewjones2435.audiohaiku.model.WordServiceApi;
import io.reactivex.Single;
import java.util.List;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WordServiceApiService {

  @GET("words")
  Single<List<WordServiceApi>> randomWordsList(@Query("?ml=")String termForApi) ;


  static WordServiceApi getInstance() {
    return InstanceHolder.INSTANCE;
  }
  class InstanceHolder {

    private static final WordServiceApi INSTANCE;

    static {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    INSTANCE = retrofit.create(WordServiceApi.class);
  }
 }
}