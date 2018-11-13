package com.whoguri.learnmvp.network;

// whoGuri 12/11/18

import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET
    public Call<JsonElement> verifyLogin();
}
