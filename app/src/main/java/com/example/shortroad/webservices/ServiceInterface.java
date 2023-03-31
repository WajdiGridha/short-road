package com.example.shortroad.webservices;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;
import com.example.shortroad.model.RouteModel;

public interface ServiceInterface {

    @GET()
    Call<RouteModel> getRoute(@Url String url);
}
