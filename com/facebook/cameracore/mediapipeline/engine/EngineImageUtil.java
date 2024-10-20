package com.facebook.cameracore.mediapipeline.engine;

import X.11T;
import X.GOp;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;

/* loaded from: EngineImageUtil.class */
public final class EngineImageUtil {
    public static final EngineImageUtil INSTANCE = new Object();

    public static final boolean getBytesFromByteArray(byte[] bArr, int i, ByteBuffer byteBuffer, int i2) {
        11T.A0F(byteBuffer, 2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inSampleSize = i2;
        try {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
            if (decodeByteArray == null) {
                return false;
            }
            decodeByteArray.copyPixelsToBuffer(byteBuffer);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final int[] getDimensionFromByteArray(byte[] bArr, int i) {
        BitmapFactory.Options A0A = GOp.A0A();
        BitmapFactory.decodeByteArray(bArr, 0, i, A0A);
        return new int[]{A0A.outWidth, A0A.outHeight};
    }
}
