package com.khadrias.java8features.design_patterns.structural.adapter;
/**
 * @author manishkhadria
 *
 */
public class UKElectricalSocket {

    public void plugIn(UKPlugConnector plug) {
        plug.provideElectricity();
    }
}