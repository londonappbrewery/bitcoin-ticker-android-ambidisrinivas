package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by AMBIDI SRINIVAS on 10-09-2017.
 */

public class DataModel {
   private double mPrice;
    public static DataModel fromJson(JSONObject jsonObject){
        try{
            DataModel Data = new DataModel();
            Data.mPrice = jsonObject.getDouble("last");
            return Data;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public double getPrice() {
        return mPrice;
    }
}
