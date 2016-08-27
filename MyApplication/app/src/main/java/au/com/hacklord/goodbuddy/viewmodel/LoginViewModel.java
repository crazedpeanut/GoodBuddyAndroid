package au.com.hacklord.goodbuddy.viewmodel;

import android.util.Log;
import android.view.View;

import au.com.hacklord.goodbuddy.manager.UserManager;

/**
 * Created by john on 27/08/2016.
 */
public class LoginViewModel {

    static final String TAG = "LoginViewModel";

    private String username;
    private String password;

    UserManager userManager;

    public void onSubmitButtonClicked(View view)
    {
        Log.d(TAG, "Login Submit Clicked! " + username + " " + password );
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
