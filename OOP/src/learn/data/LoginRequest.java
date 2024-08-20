package learn.data;

public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("Create object LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }
}
