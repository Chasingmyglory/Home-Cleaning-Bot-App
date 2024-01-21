package backEndGUI;


public class ServerResponseHandler {

    // Handle login response
    public static void handleLoginResponse(boolean success) {
        if (success) {
            System.out.println("Login successful!");
            // Proceed with login flow
        } else {
            System.out.println("Login failed. Please check your credentials.");
            // Handle login failure
        }
    }

    // Handle registration response
    public static void handleRegistrationResponse(boolean success) {
        if (success) {
            System.out.println("Registration successful!");
            // Proceed with registration flow
        } else {
            System.out.println("Registration failed. Please try again.");
            // Handle registration failure
        }
    }
}


