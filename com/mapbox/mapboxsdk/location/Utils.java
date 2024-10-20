package com.mapbox.mapboxsdk.location;

import X.0gF;
import X.AnonymousClass001;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.location.Location;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.Projection;

/* loaded from: Utils.class */
public final class Utils {
    public static final String TAG = "Mbgl-com.mapbox.mapboxsdk.location.Utils";

    public static float calculateZoomLevelRadius(MapboxMap mapboxMap, Location location) {
        if (location == null) {
            return 0.0f;
        }
        return (float) (location.getAccuracy() * (1.0d / mapboxMap.projection.nativeMapView.getMetersPerPixelAtLatitude(location.getLatitude())));
    }

    public static void ensureShadowGradientRadius(Drawable drawable) {
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setGradientRadius(1.0f);
            return;
        }
        if (!(drawable instanceof LayerDrawable)) {
            return;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= layerDrawable.getNumberOfLayers()) {
                return;
            }
            Drawable drawable2 = layerDrawable.getDrawable(i2);
            if (drawable2 instanceof GradientDrawable) {
                ((GradientDrawable) drawable2).setGradientRadius(1.0f);
            }
            i = i2 + 1;
        }
    }

    public static Bitmap generateShadow(Drawable drawable, float f) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        try {
            drawable.draw(canvas);
            int even = toEven(intrinsicWidth + f);
            int even2 = toEven(intrinsicHeight + f);
            0gF.A00(createBitmap);
            return Bitmap.createScaledBitmap(createBitmap, even, even2, false);
        } catch (IllegalArgumentException e) {
            e.getMessage();
            throw e;
        }
    }

    public static boolean immediateAnimation(Projection projection, LatLng latLng, LatLng latLng2) {
        return AnonymousClass001.A1P(((latLng.distanceTo(latLng2) / projection.nativeMapView.getMetersPerPixelAtLatitude((latLng.latitude + latLng2.latitude) / 2.0d)) > 50000.0d ? 1 : ((latLng.distanceTo(latLng2) / projection.nativeMapView.getMetersPerPixelAtLatitude((latLng.latitude + latLng2.latitude) / 2.0d)) == 50000.0d ? 0 : -1)));
    }

    public static float normalize(float f) {
        return ((f % 360.0f) + 360.0f) % 360.0f;
    }

    public static float shortestRotation(float f, float f2) {
        double d = f2 - f;
        if (d > 180.0d) {
            f += 360.0f;
        } else if (d < -180.0d) {
            return f - 360.0f;
        }
        return f;
    }

    public static int toEven(float f) {
        int i = (int) (f + 0.5f);
        if (i % 2 == 1) {
            i--;
        }
        return i;
    }
}
