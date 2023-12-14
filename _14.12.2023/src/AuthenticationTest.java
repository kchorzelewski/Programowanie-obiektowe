public class AuthenticationTest {
    public static void main(String[] args) {
        AdminAuthentication admin = new AdminAuthentication();
        admin.login("Admin", "1234");
        admin.resetPassword("Admin", "1234", "12345");
        admin.logout();
        System.out.println(admin.password);

        UserAuthentication user = new UserAuthentication();
        user.login("User", "1234");
        user.resetPassword("User", "1234", "12345");
        user.logout();
        System.out.println(user.password);
    }
}
