package com.simplilearn.session.examples;

public class CustomExceptions {
	public static void main(String[] args) {
		UserVote obj = new UserVote();
		obj.validate(12);
	}
}

class UserVote {
	public void validate(int age) {
		if(age > 18) {
			System.out.println("User is valid to vote");
		}
		else {
			throw new TooYoungToVote("User is not valid to vote");
		}
	}
}

class TooYoungToVote extends RuntimeException {
	public TooYoungToVote(String s) {
		super(s);
	}
}
