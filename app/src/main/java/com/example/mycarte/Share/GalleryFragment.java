package com.example.mycarte.Share;

import android.util.Log;

public class GalleryFragment extends Fragment
{
    private static final String TAG = "GalleryFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        Log.d(TAG, "onCreateView: started.");

        return view;
    }
}