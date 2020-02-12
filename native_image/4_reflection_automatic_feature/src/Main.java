import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        String methodName = args[0];
        User user = new User(123, "Matthias");
        Method method = user.getClass().getMethod(methodName);

        System.out.println(method.invoke(user));
    }
}
