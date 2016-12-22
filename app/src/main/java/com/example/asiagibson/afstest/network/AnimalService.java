package com.example.asiagibson.afstest.network;

import com.example.asiagibson.afstest.models.Data;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by asiagibson on 12/21/16.
 */

public interface AnimalService {
    @GET("/cgi-bin/12_21_2016_exam.pl")
    Call<Data> getAnimals();
}
