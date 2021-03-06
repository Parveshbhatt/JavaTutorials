package com.javaTuts.rtp;

// Parent with RULES :)
//abstract class Notification{
//	abstract void onNotificationReceived(String message);
//}

interface Notification{
    void onNotificationReceived(String message); //by default, public abstract 
}

// class YoutubeMember{
//	 
//	 String validTill;
//	 boolean video = true;
//	 boolean ads = false;
//	 boolean backgroundMusic = true;
// }

//class User extends YoutubeMember, Notification{  error, not support multiple inheitance
 class User implements Notification{
	String name;
	String email;
	
	User(){
		name = "John";
		email = "john@example.com";
	}

	User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public void onNotificationReceived(String message) {
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		 System.out.println("A New Notification Received");
		 System.out.println("FOR: "+name);
		 System.out.println("Message is: "+message);
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	 }

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}
	 
	 
}

//class YoutubeChannel{
//	
//	// HAS-A  Relationship -> 1 to 1
//	Notification notification;
//	
//	void subscribe(Notification notification) {
//		this.notification = notification;
//	}
//	
//	void uploadVideo(String name) {
//		// .....
//		notification.onNotificationReceived("A new Vido Uploaded "+name);
//	}
//}

class YoutubeChannel{
	
	// HAS-A  Relationship -> 1 to many
	Notification[] notifications;
	
	static int index = 0;
	
	YoutubeChannel(){
		notifications = new Notification[5];
	}
	
	void subscribe(Notification notification) {
		notifications[index] = notification;
		index++;
	}
	
	void uploadVideo(String name) {
		// .....
		for(int i=0; i<index;i++) {
		notifications[i].onNotificationReceived("A new Vido Uploaded "+name);
		}
	}
}


public class RTPyouTube {

	public static void main(String[] args) {
	
		User user = new User();
		System.out.println(user);
		
		User fionna = new User("Fionna", "fionna@example.com");
		User mike = new User("mike", "mike@example.com");

		
		YoutubeChannel channel = new YoutubeChannel();
		channel.subscribe(user);
		channel.subscribe(fionna);
		channel.subscribe(mike);
		
		
		channel.uploadVideo("RTP is FUN");
	}

}
