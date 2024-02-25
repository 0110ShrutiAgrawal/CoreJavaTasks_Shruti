package com.hughes.exercises;

abstract class DataTransfer {
	public abstract void sendSMS();

	public abstract void sendEmail();

	public abstract void sendPushNotification();

	public void display() {
		System.out.println("Message delivered...");
	}
}

public class AbstractTest extends DataTransfer {
	public static void main(String[] args) {
		AbstractTest obj = new AbstractTest() {
			@Override
			public void sendSMS() {
				System.out.println("Sending sms");
			}

			@Override
			public void sendEmail() {
				System.out.println("Sending email");
			}

			@Override
			public void sendPushNotification() {
				System.out.println("Sending notification");
			}
		};

		obj.sendSMS();
		obj.sendEmail();
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Sending sms");

	}

	@Override
	public void sendEmail() {
		// TODO Auto-generated method stub
		System.out.println("Sending email");

	}

	@Override
	public void sendPushNotification() {
		// TODO Auto-generated method stub
		System.out.println("Sending notification");

	}
}
