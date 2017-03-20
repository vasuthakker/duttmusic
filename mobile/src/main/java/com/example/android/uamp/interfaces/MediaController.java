package com.example.android.uamp.interfaces;

import android.support.v4.media.MediaBrowserCompat;

import com.example.android.uamp.ui.MediaBrowserProvider;

/**
 * Created by Viral on 20-03-2017.
 */


public interface MediaController extends MediaBrowserProvider {
    void onMediaItemSelected(MediaBrowserCompat.MediaItem item);

    void setToolbarTitle(CharSequence title);
}