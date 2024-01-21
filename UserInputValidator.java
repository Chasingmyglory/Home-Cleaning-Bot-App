package frontEndGUI;


import java.util.regex.Pattern;

public class UserInputValidator {

    // Email validation pattern
    private static final Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    // Validate email format
    public static boolean validateEmail(String email) {
        return emailPattern.matcher(email).matches();
    }

    // Validate password criteria
    public static boolean validatePassword(String password) {
        // Example: Password must be at least 8 characters long. You can add more criteria.
        return password != null && password.length() >= 8;
    }

    // Validate registration details
    public static boolean validateRegistrationDetails(User user) {
        // Assuming User class has getEmail and getPassword methods.
        return validateEmail(user.getEmail()) && validatePassword(user.getPassword());
    }
}

