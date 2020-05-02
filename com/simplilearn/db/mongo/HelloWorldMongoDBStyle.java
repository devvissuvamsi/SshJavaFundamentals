package com.simplilearn.db.mongo;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;

import org.apache.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldMongoDBStyle {
	public static void main(String[] args) {
		
		/*
		 * LoggerContext loggerContext = (LoggerContext)
		 * LoggerFactory.getILoggerFactory(); Logger rootLogger =
		 * loggerContext.getLogger("org.mongodb.driver");
		 * 
		 * LogManager.getLogger("org.mongodb.driver.connection").setLevel(org.apache.
		 * log4j.Level.OFF);
		 * LogManager.getLogger("org.mongodb.driver.management").setLevel(org.apache.
		 * log4j.Level.OFF);
		 * LogManager.getLogger("org.mongodb.driver.cluster").setLevel(org.apache.log4j.
		 * Level.OFF);
		 * LogManager.getLogger("org.mongodb.driver.protocol.insert").setLevel(org.
		 * apache.log4j.Level.OFF);
		 * LogManager.getLogger("org.mongodb.driver.protocol.query").setLevel(org.apache
		 * .log4j.Level.OFF);
		 * LogManager.getLogger("org.mongodb.driver.protocol.update").setLevel(org.
		 * apache.log4j.Level.OFF);
		 */
		//rootLogger.
		
		MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));
		DB db = mongoClient.getDB("first-test");
		DBCollection collection = db.getCollection("users");
		DBObject document = collection.findOne();
		System.out.println(document);
	}
}