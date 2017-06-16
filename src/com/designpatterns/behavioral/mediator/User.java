package com.designpatterns.behavioral.mediator;

/**
 * Created by ryang on 13/06/2017.
 */
public class User {
	private ChatRoom channel;
	private String name;

	public User (ChatRoom channel) {
		this.channel = channel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void sendMessage(String message){
		channel.showMessage(this,message);
	}
}
