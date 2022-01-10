package com.khadrias.java8features.design_patterns.structural.adapter;
/**
 * @author manishkhadria
 *
 */
public class GermanPlugConnectorImpl implements GermanPlugConnector {

    public void giveElectricity() {
    	System.out.println("German Plug Connector Working");
    }
}