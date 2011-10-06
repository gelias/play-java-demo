package controllers;

import models.Feedback;
import play.mvc.Controller;

public class Application extends Controller {

	public static void index() {
		render();
	}

	public static void feedback() {
		String message = "Give us your feedback: Is play a very cool framework?";
		Long count = Feedback.count();
		render(count, message);
	}

	public static void vote() {
		Feedback feedback = new Feedback(Boolean.TRUE);
		feedback.save();
		long count = Feedback.count();
		renderJSON(count);
	}
}
