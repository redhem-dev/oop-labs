package Week10.Task1;




import Week10.Task1.Annotations.CanSendMessage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        User user=new User("user123");
        Admin admin=new Admin("admin123");

        TheMessagingSystem theMessagingSystem=new TheMessagingSystem();
        for (Method method:theMessagingSystem.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(CanSendMessage.class)){
                method.invoke(theMessagingSystem, user,"user message");
                method.invoke(theMessagingSystem,admin,"admin message");
            }
        }

    }
}