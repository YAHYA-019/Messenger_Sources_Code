package com.mapbox.mapboxsdk.text;

import X.DKC;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;

/* loaded from: LocalGlyphRasterizer.class */
public class LocalGlyphRasterizer {
    public final Bitmap bitmap;
    public final Canvas canvas;
    public final Paint paint;

    public LocalGlyphRasterizer() {
        Bitmap createBitmap = Bitmap.createBitmap(35, 35, Bitmap.Config.ARGB_8888);
        this.bitmap = createBitmap;
        Paint A09 = DKC.A09();
        this.paint = A09;
        A09.setAntiAlias(true);
        A09.setTextSize(24.0f);
        Canvas canvas = new Canvas();
        this.canvas = canvas;
        canvas.setBitmap(createBitmap);
    }

    public Bitmap drawGlyphBitmap(String str, boolean z, char c) {
        this.paint.setTypeface(Typeface.create(str, z ? 1 : 0));
        this.canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.canvas.drawText(String.valueOf(c), 0.0f, 20.0f, this.paint);
        return this.bitmap;
    }
}
