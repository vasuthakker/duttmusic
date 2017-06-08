package com.example.android.uamp.ui;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.uamp.R;

import java.util.List;

/**
 * Created by Viral on 10-05-2017.
 */

public class ShareDialog extends DialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_share);

        ImageView imgFb = (ImageView) dialog.findViewById(R.id.share_imgfb);
        ImageView imgWhats = (ImageView) dialog.findViewById(R.id.share_imgwhats);
        ImageView imgGPlus = (ImageView) dialog.findViewById(R.id.share_imggplus);
        ImageView imgTwi = (ImageView) dialog.findViewById(R.id.share_imgtwi);
        ImageView imgRatings= (ImageView) dialog.findViewById(R.id.ratingBar);

        imgFb.setOnClickListener(shareWithService("facebook"));
        imgWhats.setOnClickListener(shareWithService("whatsapp"));
        imgGPlus.setOnClickListener(shareWithService("apps.plus"));
        imgTwi.setOnClickListener(shareWithService("twitter"));


        TextView txtCall= (TextView) dialog.findViewById(R.id.share_txtcall);

        TextView txtLink= (TextView) dialog.findViewById(R.id.share_txtlink);

        txtCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", getString(R.string.creator), null));
                startActivity(intent);
            }
        });

        txtLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.piyushranafilms.com/"));
                startActivity(browserIntent);
            }
        });

        imgRatings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                visitGooglePlayAppPage();
            }
        });


        return dialog;
    }

    private void visitGooglePlayAppPage()
    {
        final String appPackageName = getActivity().getPackageName(); // getPackageName() from Context or Activity object
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
        } catch (android.content.ActivityNotFoundException anfe) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
        }
    }

    private View.OnClickListener shareWithService(final String service) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, String.format(getString(R.string.share_message),getString(R.string.app_name),getActivity().getPackageName()));
                PackageManager pm = getActivity().getPackageManager();
                List<ResolveInfo> activityList = pm.queryIntentActivities(shareIntent, 0);
                boolean isFound=false;
                for (final ResolveInfo app : activityList) {
                    if ((app.activityInfo.name).contains(service)) {
                        isFound=true;
                        final ActivityInfo activity = app.activityInfo;
                        final ComponentName name = new ComponentName(activity.applicationInfo.packageName, activity.name);
                        shareIntent.addCategory(Intent.CATEGORY_LAUNCHER);
                        shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                        shareIntent.setComponent(name);
                        startActivity(shareIntent);
                        break;
                    }
                }
                if(!isFound)
                    Toast.makeText(getActivity(), "Please install app to share", Toast.LENGTH_SHORT).show();
            }
        };

    }
}
