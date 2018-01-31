package lichen000.designpatten.mediator;

import java.util.Date;

/**
 * Created by chen.li200 on 2018-01-31
 */
public class ChatRoom {

	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
	}
}
