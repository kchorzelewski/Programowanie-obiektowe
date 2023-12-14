public class AdminAuthentication implements Authentication{
    public String username = "Admin";
    public String password = "1234";
    public boolean isLogged = false;
    @Override
    public boolean login(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)){
            isLogged = true;
            return true;
        }
        return false;
    }
    @Override
    public void logout() {
        if (isLogged)
            isLogged = false;
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if(oldPassword.equals(this.password) && isLogged){
            this.password = newPassword;
            return true;
        }
        return false;
    }
}
