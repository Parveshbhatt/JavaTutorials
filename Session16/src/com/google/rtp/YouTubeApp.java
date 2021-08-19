package com.google.rtp;

abstract class Notification{
	Notification(){
		System.out.println("abstract class Notification's object constructed");
	}
	abstract void notifyWithMessage(String message);
}

class YoutubeChannel{
	
	Notification notification;
	
	void subscribe(User user) {
		// RTP
		notification = user;
	}
	
	void uploadVideo(String name) {
		System.out.println("Video Uploaded");
		notification.notifyWithMessage("A new Video Uploaded "+name);
	}
}

class User extends Notification{
	
	void notifyWithMessage(String message) {
		System.out.println("Notification Received");
		System.out.println(message);
	}
}



public class YouTubeApp {

	public static void main(String[] args) {
		
		User user = new User();
		
		YoutubeChannel channel = new YoutubeChannel();
		
		channel.subscribe(user);
		
		channel.uploadVideo("RTP with java");
		
	}

}
