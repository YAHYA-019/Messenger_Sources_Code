package com.mapbox.mapboxsdk.location;

import android.content.Context;
import android.graphics.Bitmap;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.utils.BitmapUtils;

/* loaded from: LayerBitmapProvider.class */
public class LayerBitmapProvider {
    public final Context context;

    public LayerBitmapProvider(Context context) {
        this.context = context;
    }

    public Bitmap generateBitmap(int i, Integer num) {
        return BitmapUtils.getBitmapFromDrawable(BitmapUtils.getDrawableFromRes(this.context, i, num));
    }

    public Bitmap generateShadowBitmap(LocationComponentOptions locationComponentOptions) {
        return Utils.generateShadow(BitmapUtils.getDrawableFromRes(this.context, R.drawable.mapbox_user_icon_shadow, null), locationComponentOptions.elevation);
    }
}
