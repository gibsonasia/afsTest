package com.example.asiagibson.afstest.frags;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asiagibson.afstest.R;
import com.example.asiagibson.afstest.models.Animals;
import com.example.asiagibson.afstest.models.Data;
import com.example.asiagibson.afstest.network.AnimalService;
import com.example.asiagibson.afstest.recyclerview.AnimalAdapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by asiagibson on 12/21/16.
 */
//http://jsjrobotics.nyc/cgi-bin/12_21_2016_exam.pl
//complete url
public class Animals_frag extends Fragment{
    private static final String URL = "http://jsjrobotics.nyc";
    private static final String TAG = "Retrofit";

    RecyclerView rv;
    AnimalAdapter adapter;
    List<Animals> animalsList = new ArrayList<>();

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.animal_frag, container, false);
        //only the root knows where the recyclerview is which is why we use findViewByID on it
        rv = (RecyclerView) root.findViewById((R.id.a_rv));
        rv.setLayoutManager(new LinearLayoutManager(root.getContext(), LinearLayoutManager.VERTICAL, false));

        fetchAnimals();
        return root;
    }
//    public void runRetrofitCall() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        AnimalService service = retrofit.create(AnimalService.class);
//        Call<Data> call = service.getAnimals();
//
//        call.enqueue(new Callback<Data>() {
//            @Override
//            public void onResponse(Call<Data> call, Response<Data> response) {
//                try {
//                    if (response.isSuccessful()) {
//                        Log.d(TAG, "Success");
//                        adapter.set
//                       // adapter.set(response.body().getAnimals());
//                    } else {
//                        Log.d(TAG, "Error" + response.errorBody().string());
//                    }
//                } catch (IOException e) {
//                    Log.e(TAG, e.getMessage());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Data> call, Throwable t) {
//                // Something went completely wrong (like no internet connection)
//                Log.d("Error", t.getMessage());
//            }
//        });


    private void fetchAnimals() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AnimalService service = retrofit.create(AnimalService.class);

        Call<Data> call = service.getAnimals();
        call.enqueue(new Callback<Data>() { //needs to be enqueue so the call is asynchronous and will not block the main thread

            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                Data dataResponse = response.body();
                textView.setText(response.body().getSuccess());
//                Animals theAnimal = dataResponse.getAnimals();
//               animalsList = theAnimal.g

                adapter = new AnimalAdapter(animalsList); //pass our list of songs into the adapter
                rv.setAdapter(adapter); //set adapter to the recyclerView with the song list
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {

            }
        });


    }
}
