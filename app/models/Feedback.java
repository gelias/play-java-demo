package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity(name = "feedback")
public class Feedback extends Model {

	public boolean like;

	public Feedback(boolean feedback) {
		this.like = feedback;
	}
}
