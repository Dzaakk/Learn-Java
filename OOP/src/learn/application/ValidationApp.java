package learn.application;

import learn.data.LoginRequest;
import learn.error.ValidationException;
import learn.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null, null);

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Success");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Error : " + exception.getMessage());
        } finally {
            System.out.println("END");
        }
    }
}
