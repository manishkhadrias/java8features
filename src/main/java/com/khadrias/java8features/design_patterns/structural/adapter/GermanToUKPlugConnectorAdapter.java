package com.khadrias.java8features.design_patterns.structural.adapter;

public class GermanToUKPlugConnectorAdapter implements UKPlugConnector {

	private GermanPlugConnector plug;

	public GermanToUKPlugConnectorAdapter(GermanPlugConnector plug) {
		this.plug = plug;
	}

	@Override
	public void provideElectricity() {
		System.out.println("IN UK Plug Connector");
		plug.giveElectricity();
	}

	public static void main(String[] args) {
		GermanPlugConnector plugConnector = new GermanPlugConnectorImpl();
		UKElectricalSocket electricalSocket = new UKElectricalSocket();
		UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(plugConnector);
		electricalSocket.plugIn(ukAdapter);
	}
}