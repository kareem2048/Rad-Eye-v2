
package com.p4f.kareem.rad_eye_v2.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IncludeFlightPlan {

    @SerializedName("requested")
    @Expose
    private String requested;
    @SerializedName("interpreted")
    @Expose
    private Boolean interpreted;

    public String getRequested() {
        return requested;
    }

    public void setRequested(String requested) {
        this.requested = requested;
    }

    public Boolean getInterpreted() {
        return interpreted;
    }

    public void setInterpreted(Boolean interpreted) {
        this.interpreted = interpreted;
    }

}
