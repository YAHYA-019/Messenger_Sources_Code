package com.mapbox.mapboxsdk.utils;

import X.0gF;
import X.C53e;
import X.C53f;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.common.dextricks.Constants;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: BitmapUtils.class */
public class BitmapUtils {
    public static Bitmap createBitmapFromView(View view) {
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(Constants.LOAD_RESULT_WITH_VDEX_ODEX);
        view.buildDrawingCache();
        if (view.getDrawingCache() == null) {
            return null;
        }
        Bitmap drawingCache = view.getDrawingCache();
        0gF.A00(drawingCache);
        Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return createBitmap;
    }

    public static boolean equals(Bitmap bitmap, Bitmap bitmap2) {
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getHeight() * bitmap.getRowBytes());
        bitmap.copyPixelsToBuffer(allocate);
        ByteBuffer allocate2 = ByteBuffer.allocate(bitmap2.getHeight() * bitmap2.getRowBytes());
        bitmap2.copyPixelsToBuffer(allocate2);
        return Arrays.equals(allocate.array(), allocate2.array());
    }

    public static Bitmap getBitmapFromDrawable(Drawable drawable) {
        Bitmap bitmap = null;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    Drawable mutate = constantState.newDrawable().mutate();
                    Bitmap createBitmap = Bitmap.createBitmap(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    mutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    mutate.draw(canvas);
                    return createBitmap;
                }
            }
        }
        return bitmap;
    }

    public static byte[] getByteArrayFromDrawable(Drawable drawable) {
        Bitmap bitmapFromDrawable;
        byte[] bArr = null;
        if (drawable != null && (bitmapFromDrawable = getBitmapFromDrawable(drawable)) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapFromDrawable.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        }
        return bArr;
    }

    public static Drawable getDrawableFromByteArray(Context context, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static Drawable getDrawableFromRes(Context context, int i) {
        return getDrawableFromRes(context, i, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable getDrawableFromRes(Context context, int i, Integer num) {
        Drawable drawable;
        try {
            drawable = context.getResources().getDrawable(i);
        } catch (Exception unused) {
            Resources resources = context.getResources();
            C53e c53e = new C53e();
            ((C53f) c53e).A00 = resources.getDrawable(i, null);
            drawable = c53e;
        }
        if (drawable != true) {
            return null;
        }
        if (num != null) {
            drawable.setTint(num.intValue());
        }
        return drawable;
    }

    public static Bitmap mergeBitmap(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap2, 10.0f, 10.0f, (Paint) null);
        return createBitmap;
    }
}
