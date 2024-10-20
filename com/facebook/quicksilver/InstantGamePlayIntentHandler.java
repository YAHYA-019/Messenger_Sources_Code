package com.facebook.quicksilver;

import X.C3o5;
import X.DKB;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: InstantGamePlayIntentHandler.class */
public final class InstantGamePlayIntentHandler {
    public static Intent A00(Context context, Intent intent) {
        Uri data = intent.getData();
        Intent intent2 = null;
        if (intent.getData() != null && data != null && data.getPath() != null && data.getPath().contains("play")) {
            String queryParameter = data.getQueryParameter("game_id");
            String queryParameter2 = data.getQueryParameter(Property.SYMBOL_Z_ORDER_SOURCE);
            String queryParameter3 = data.getQueryParameter("context_type");
            String queryParameter4 = data.getQueryParameter("context_id");
            String queryParameter5 = data.getQueryParameter("payload");
            String queryParameter6 = data.getQueryParameter("custom_update_id");
            String queryParameter7 = data.getQueryParameter("content_identifier");
            String queryParameter8 = data.getQueryParameter("click_identifier");
            String queryParameter9 = data.getQueryParameter("entrypoint_feature");
            String queryParameter10 = data.getQueryParameter("gd_impression_id");
            String queryParameter11 = data.getQueryParameter("play_style");
            if (queryParameter != null) {
                intent2 = C3o5.A0D(context, QuicksilverActivity.class);
                intent2.setFlags(268435456);
                intent2.putExtra("app_id", queryParameter);
                intent2.putExtra(Property.SYMBOL_Z_ORDER_SOURCE, queryParameter2);
                intent2.putExtra(DKB.A00(56), queryParameter3);
                intent2.putExtra("source_id", queryParameter4);
                intent2.putExtra(DKB.A00(24), queryParameter5);
                intent2.putExtra("custom_update_id", queryParameter6);
                intent2.putExtra("content_identifer", queryParameter7);
                intent2.putExtra("click_identifer", queryParameter8);
                intent2.putExtra("entrypoint_feature", queryParameter9);
                intent2.putExtra("gd_impression_id", queryParameter10);
                intent2.putExtra("play_style", queryParameter11);
            }
        }
        return intent2;
    }
}
