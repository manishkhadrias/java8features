package com.khadrias.java8features.design_patterns.creational.factorymetthod;

public class EmailNotificationExecutor implements NotificationExecutor {

	@Override
	public void executeNotification() {
		System.out.println("Email notification sent");
	}
}