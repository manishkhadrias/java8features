package com.khadrias.java8features.design_patterns.structural.adapter;
public class UKElectricalSocket {

    public void plugIn(UKPlugConnector plug) {
        plug.provideElectricity();
    }
}