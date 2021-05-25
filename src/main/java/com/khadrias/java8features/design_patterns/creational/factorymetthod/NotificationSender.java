package com.khadrias.java8features.design_patterns.creational.factorymetthod;

public class NotificationSender {

	public static void main(String[] args) {
		NotificationExecutorFactory.getNotificationExecutor(ExecutorType.EMAIL).executeNotification();
	}
}