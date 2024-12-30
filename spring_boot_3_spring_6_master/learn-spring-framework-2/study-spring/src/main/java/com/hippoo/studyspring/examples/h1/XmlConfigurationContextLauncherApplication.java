package com.hippoo.studyspring.examples.h1;

import com.hippoo.studyspring.game.GameRunner;
import java.util.Arrays;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationContextLauncherApplication {

    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            context.getBean(GameRunner.class).run();
        }

    }
}
