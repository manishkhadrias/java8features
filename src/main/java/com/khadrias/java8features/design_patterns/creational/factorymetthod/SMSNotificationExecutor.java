package com.khadrias.java8features.design_patterns.creational.factorymetthod;

/**
 * @author manishkhadria
 *
 */
public class SMSNotificationExecutor implements NotificationExecutor {

	@Override
	public void executeNotification() {
		System.out.println("SMS notification sent.");
	}
}