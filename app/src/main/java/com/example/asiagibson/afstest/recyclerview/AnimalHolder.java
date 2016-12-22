package com.example.asiagibson.afstest.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.asiagibson.afstest.R;
import com.example.asiagibson.afstest.models.Animals;

/**
 * Created by asiagibson on 12/21/16.
 */

public class AnimalHolder extends RecyclerView.ViewHolder {

    TextView textColor;
    TextView background;
    TextView name;
  //  public Animals animal;

    public AnimalHolder(View itemView) {
        super(itemView);

        textColor = (TextView) itemView.findViewById(R.id.text_color);
        background = (TextView) itemView.findViewById(R.id.text_background);
        name = (TextView) itemView.findViewById(R.id.text_name);

    }

    public void bind(Animals animal) {
        textColor.setText(animal.getTextColor());
        background.setText(animal.getBackground());
        name.setText(animal.getName());

    }
}
