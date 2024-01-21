package backEndGUI;

import frontEndGUI.User;
import frontEndGUI.UserInputValidator;

public class AuthenticationService {

    public boolean loginUser(String email, String password) {
        // TODO: Implement backend communication for login
        // Dummy implementation for the example
        return "user@example.com".equals(email) && "password123".equals(password);
    }

    public boolean registerUser(User user) {
        // TODO: Implement backend communication for registration
        // Dummy implementation for the example
        return UserInputValidator.validateRegistrationDetails(user);
    }
}

