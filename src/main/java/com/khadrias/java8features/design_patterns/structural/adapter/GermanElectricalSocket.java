package com.khadrias.java8features.design_patterns.structural.adapter;
public class GermanElectricalSocket {

    public void plugIn(GermanPlugConnector plug) {
        plug.giveElectricity();
    }
}