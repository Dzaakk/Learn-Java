package learn.application;

import learn.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest LoginRequest = new LoginRequest("agentA", "pass123");

        System.out.println(LoginRequest.username());
        System.out.println(LoginRequest.password());
        System.out.println(LoginRequest);

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("AgentC"));
        System.out.println(new LoginRequest("AgentC", "pass456"));
    }
}
