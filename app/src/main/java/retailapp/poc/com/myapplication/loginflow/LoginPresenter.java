package retailapp.poc.com.myapplication.loginflow;

public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
