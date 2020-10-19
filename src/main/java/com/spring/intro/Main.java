package com.spring.intro;

import com.spring.intro.config.AppConfig;
import com.spring.intro.model.User;
import com.spring.intro.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User user1 = new User();
        user1.setName("User1");
        User user2 = new User();
        user2.setName("User2");
        userService.add(user1);
        userService.add(user2);
        userService.listUsers().forEach(System.out::println);
    }
}
