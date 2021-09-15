package com.Parvesh.dao;

import java.util.ArrayList;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.Parvesh.model.Fever;
import com.Parvesh.model.User;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

// Mongo DB Code :)
public class DB {
	MongoClient mongoClient;

	public DB() {

		try {
			String connectionUrl = "mongodb+srv://Parvesh:Parvesh123@cluster0.mabb7.mongodb.net/pj2021db?retryWrites=true&w=majority";
			mongoClient = MongoClients.create(connectionUrl);

			System.out.println(getClass().getSimpleName()
					+ " MongoDB Connection Created and Reference to Client Object obtained ");

		} catch (Exception e) {
			System.out.println("Something went wrong: " + e);

		}

	}

	public boolean registerUser(User user) {
		// MongoDB Document which converts HashMap to Document | BOXING
		Document document = new Document(user.toMap());

		// Insert into DataBase
		mongoClient.getDatabase("pj2021db").getCollection("students-java").insertOne(document);
		System.out.println(user.getName() + " Register in MongoDB");

		return true;
	}

	public boolean loginUser(User user) {

		System.out.println("[DB] USER DATA: " + user);

		BasicDBObject query = new BasicDBObject();
		query.put("email", user.email);
		query.put("password", user.password);

		MongoCursor<Document> cursor = mongoClient.getDatabase("pj2021db").getCollection("students-java").find(query)
				.iterator();
//    	while(cursor.hasNext()) {
//    		System.out.println(cursor.next().toJson());
//    		

//    	}

		boolean flag = cursor.hasNext();
		if (flag) {
			// System.out.println(cursor.next().toJson());
			Document document = cursor.next();
			System.out.println(document.getObjectId("_id"));
			System.out.println(document.getString("name"));

			user._id = document.getObjectId("_id").toString();
			user.name = document.getString("name");

			System.out.println("[DB] User Data After Successfull login: " + user);

		}
		return flag;
	}

	public boolean logFever(Fever fever) {
		// MongoDB Document which converts HashMap to Document | BOXING
		Document document = new Document(fever.toMap());

		// Insert into DataBase
		mongoClient.getDatabase("pj2021db").getCollection("fevers").insertOne(document);
		System.out.println(fever.userId + " " + fever.fever + " fever saved in MongoDB");

		return true;
	}

	public ArrayList<Fever> fetchFevers(String userId) {

		ArrayList<Fever> feverRecords = new ArrayList<Fever>();

		BasicDBObject query = new BasicDBObject();
		query.put("userId", userId);

		try {
			MongoCursor<Document> cursor = mongoClient.getDatabase("pj2021db").getCollection("fevers").find(query)
					.iterator();
			while (cursor.hasNext()) {
				Document document = cursor.next();
				Fever fever = new Fever();

				fever._id = document.getObjectId("_id").toString();
				fever.userId = document.getString("userId");
				fever.dateTimeStamp = document.getString("dateTimeStamp");
				fever.fever = document.getDouble("fever");

				feverRecords.add(fever);

			}
		} catch (Exception e) {
			System.out.println("Something went wrong: " + e);
		}

		return feverRecords;
	}
	
	public void deleteFever(String feverId) {

		System.out.println("[DB] Deleting Fever" + feverId);

		BasicDBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(feverId) );

	    mongoClient.getDatabase("pj2021db").getCollection("fevers").deleteOne(query);
	}
	
	public void updateFever(double fever, String feverId) {
		// MongoDB Document which converts HashMap to Document | BOXING
		
		System.out.println("[DB] Updating Fever  " + feverId);
		
		
		BasicDBObject query = new BasicDBObject();
		query.put("_id", new ObjectId(feverId) );
		
		MongoCursor<Document> cursor = mongoClient.getDatabase("pj2021db").getCollection("fevers").find(query).iterator();
		
		Document document = cursor.next();
		
		document.put("fever", fever);
		
		ObjectId oId = new ObjectId(feverId);
		
		System.out.println("[DB] "+document.toJson());
		
		// Insert into DataBase
		mongoClient.getDatabase("pj2021db").getCollection("fevers").updateOne(Filters.eq("_id", oId), Updates.set("fever", fever));
		System.out.println("Fever Updated");

	}
	
	
	
	

	public void fetchUsers() {
		try {
			MongoCursor<Document> cursor = mongoClient.getDatabase("pj2021db").getCollection("students-java").find().iterator();
			while (cursor.hasNext()) {
//	    		System.out.println(cursor.next());
				System.out.println(cursor.next().toJson());
				
			}
		} catch (Exception e) {
			System.out.println("Something went wrong: " + e);
		}
	}

}