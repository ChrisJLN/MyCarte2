package com.example.mycarte.Utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.example.mycarte.R;
import com.example.mycarte.models.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;

public class FirebaseMethods {

    private static final String TAG = "FirebaseMethods";

    //firebase
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private String userID;
    private Context mContext;

    public FirebaseMethods(Context context){
        mAuth =FirebaseAuth.getInstance();
        mContext = context;
         if (mAuth.getCurrentUser() != null){
             userID = mAuth.getCurrentUser().getUid();
         }

    }
    public boolean checkIfUsernameExists(String username, DataSnapshot dataSnapshot){
        Log.d(TAG, "checkIfUsernameExists: checking if " + username + "already exists.");

        User user = new User();

        for(DataSnapshot ds: dataSnapshot.getChildren()){
            Log.d(TAG, "checkIfUsernameExists: datasnapshot: " + ds);

            user.setUser_id(ds.getValue(User.class).getUsername());
            Log.d(TAG, "checkIfUsernameExists: datasnapshot: " + user.getUsername());
        }
        return true;
    }
    /**
     * Register a new email and password to Firebase Authentication
     * @param email
     * @param password
     * @param username
     */
    public void registerNewEmail(final String email, String password, final String username){
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success" + task.isSuccessful());

                            // If sign in fails, display a message to the user.
                            if (!task.isSuccessful()){
                            Toast.makeText(mContext, R.string.auth_failed,
                                    Toast.LENGTH_SHORT).show();
                            }
                            else if(task.isSuccessful()){
                                userID = mAuth.getCurrentUser().getUid();
                                Log.d(TAG, "onComplete: Authstate changed: " + userID);
                            }

                        // ...
                    }
                });
    }
}
