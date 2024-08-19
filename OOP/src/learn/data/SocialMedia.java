package learn.data;

public class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    final void login(String username, String password) {
        // body method
    }

}

class FakeFacebook extends Facebook {
    // Error
    // void login(String username, String password) {
    // // body method
    // }
}
