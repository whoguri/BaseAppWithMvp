package com.whoguri.learnmvp.network;

// whoGuri 12/11/18

import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class Network {
    private static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("http://sachtechsolution.com/anamelbeauty/api/")
                .addConverterFactory(getConverterFactory())
                .client(getClient())
                .build();
    }

    private static Converter.Factory getConverterFactory() {
        return GsonConverterFactory.create();
    }

    private static OkHttpClient getClient() {
        return new OkHttpClient.Builder()
                .readTimeout(300, TimeUnit.SECONDS)
                .writeTimeout(300, TimeUnit.SECONDS)
                .connectTimeout(300, TimeUnit.SECONDS)
                //.addInterceptor(loggingInterceptor)
                //.addInterceptor(apiKeyInterceptor)
                .build();
    }

   public static Api callApi() {
        return getRetrofit().create(Api.class);
    }
}
