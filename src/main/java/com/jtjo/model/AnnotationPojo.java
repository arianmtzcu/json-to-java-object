package com.jtjo.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 */
public class AnnotationPojo {

    @SerializedName("someName") private String name;
    @SerializedName("someAge") private int age;
    @SerializedName("someColour") private String favouriteColour;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavouriteColour() {
        return favouriteColour;
    }
}
