package com.khadrias.java8features.design_patterns.creational.factorymetthod;

public class NotificationExecutorFactory {

	public static NotificationExecutor getNotificationExecutor(ExecutorType executorType) {
		if (executorType == ExecutorType.EMAIL)
			return new EmailNotificationExecutor();
		if (executorType == ExecutorType.SMS)
			return new SMSNotificationExecutor();
		return null;
	}
}