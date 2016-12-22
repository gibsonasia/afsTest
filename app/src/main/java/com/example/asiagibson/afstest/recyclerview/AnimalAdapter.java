package com.example.asiagibson.afstest.recyclerview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.asiagibson.afstest.R;
import com.example.asiagibson.afstest.models.Animals;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by asiagibson on 12/21/16.
 */

public class AnimalAdapter extends RecyclerView.Adapter<AnimalHolder> {

    List<Animals> animalsList;

    public AnimalAdapter(List<Animals> animalsList){
        this.animalsList = animalsList;
    }

    @Override
    public AnimalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AnimalHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return animalsList.size();
    }
}
