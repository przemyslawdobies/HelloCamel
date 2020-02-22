package pl.atkom.app;

import pl.altkom.utils.HelloUtil;

public class HelloCamelCase {
    public static String GREETING = "HELLO";

    public static String greetWithUpperCase (String name){
        return HelloUtil.hello("Tomek").toUpperCase();
    }
}
