package com.example.asiagibson.afstest.models;

import java.util.List;

/**
 * Created by asiagibson on 12/21/16.
 */

public class Data {
    private List<Animals> animals;

    private String success;

    public List<Animals> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animals> animals) {
        this.animals = animals;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "ClassPojo [animals = " + animals + ", success = " + success + "]";
    }
}
