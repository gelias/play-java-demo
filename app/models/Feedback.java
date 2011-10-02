package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Feedback extends Model {

	public String name;
	public boolean like;
	public boolean dislike;

	public Feedback(boolean feedback) {
		if (feedback) {
			this.like = feedback;
			this.dislike = !feedback;
		} else {
			this.like = feedback;
			this.dislike = !feedback;
		}
	}
}
