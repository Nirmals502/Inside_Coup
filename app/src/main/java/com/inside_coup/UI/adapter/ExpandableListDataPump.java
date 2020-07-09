package com.inside_coup.UI.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        LinkedHashMap <String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        List<String> cricket1 = new ArrayList<String>();
        List<String> cricket2 = new ArrayList<String>();
        List<String> cricket3 = new ArrayList<String>();
        List<String> cricket4 = new ArrayList<String>();


        List<String> football = new ArrayList<String>();
        football.add("Brazil");
        football.add("Spain");
        football.add("Germany");
        football.add("Netherlands");
        football.add("Italy");

        List<String> basketball = new ArrayList<String>();
        basketball.add("United States");


        expandableListDetail.put("About Us", cricket);
        expandableListDetail.put("Contact Us", cricket1);
        expandableListDetail.put("Social Media", basketball);
        expandableListDetail.put("My Profile", cricket2);
        expandableListDetail.put("Redeemed Coupons", cricket3);
        expandableListDetail.put("Logout", cricket4);

        return expandableListDetail;
    }
}
