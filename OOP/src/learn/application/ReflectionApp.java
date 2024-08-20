package learn.application;

import learn.data.CreateUserRequest;
import learn.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("agent c");
        request.setPassword("agent c");
        ValidationUtil.validationreflection(request);
    }
}
