package com.example.mycarte.Utils;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.content.Context;
import android.view.MenuItem;

import com.example.mycarte.Home.HomePageActivity;
import com.example.mycarte.Likes.MapMarkerActivity;
import com.example.mycarte.Profile.ProfileActivity;
import com.example.mycarte.R;
import com.example.mycarte.Search.SearchActivity;
import com.example.mycarte.Share.ShareActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper
{
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx)
    {
        Log.d(TAG, "setupBottomNavigationView: Setting up Bottom NavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
        
    }

    //ACTIVITY_NUM starts at 0 from left to right
    public static void enableNavigation(final Context context, BottomNavigationViewEx view)
    {
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.ic_house:
                        //ACTIVITY_NUM = 0
                        Intent intent1 = new Intent(context, HomePageActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        //ACTIVITY_NUM = 1
                        Intent intent2 = new Intent(context, SearchActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_circle:
                        //ACTIVITY_NUM = 2
                        Intent intent4 = new Intent(context, ShareActivity.class);
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_alert:
                        //ACTIVITY_NUM = 3
                        Intent intent5 = new Intent(context, MapMarkerActivity.class);
                        context.startActivity(intent5);
                        break;
                    case R.id.ic_android:
                        //ACTIVITY_NUM = 4
                        Intent intent3 = new Intent(context, ProfileActivity.class);
                        context.startActivity(intent3);
                        break;


                }
                return false;
            }
        });
    }
}
