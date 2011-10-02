package controllers;

import models.Feedback;
import play.mvc.Controller;

public class Application extends Controller {

	public static void index() {
		render();
	}

	public static void feedback() {
		String message = "Yes, play is very cool";
		Long count = Feedback.count();
		render(count, message);
	}

}
