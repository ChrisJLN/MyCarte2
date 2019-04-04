package com.example.mycarte.Share;


import android.os.Bundle;
import android.support.annotation.Nullable;


import com.example.mycarte.R;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;

public class PhotoFragment extends Fragment
{
    private static final String TAG = "PhotoFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_photo, container, false);
        Log.d(TAG, "onCreateView: started.");


        return view;
    }
}
