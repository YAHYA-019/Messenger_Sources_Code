package com.facebook.webpsupport;

import X.0L4;
import X.AnonymousClass001;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: WebpBitmapFactoryImpl.class */
public class WebpBitmapFactoryImpl {
    public static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (options == null || (bitmap = options.inBitmap) == null || !bitmap.isMutable()) {
            throw AnonymousClass001.A0Q("jpegGenerator");
        }
        return options.inBitmap;
    }

    public static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[8192] : bArr;
    }

    public static float getScaleFromOptions(BitmapFactory.Options options) {
        float f = 1.0f;
        if (options != null) {
            int i = options.inSampleSize;
            if (i > 1) {
                f = 1.0f / i;
            }
            if (options.inScaled) {
                int i2 = options.inDensity;
                int i3 = options.inTargetDensity;
                int i4 = options.inScreenDensity;
                if (i2 != 0 && i3 != 0 && i2 != i4) {
                    f = i3 / i2;
                }
            }
        }
        return f;
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        0L4.A00();
        return BitmapFactory.decodeByteArray(bArr, i, i2, null);
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        0L4.A00();
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        Bitmap bitmap = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                bitmap = hookDecodeStream(fileInputStream, null, options);
                fileInputStream.close();
                return bitmap;
            } finally {
            }
        } catch (Exception unused) {
            return bitmap;
        }
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (r315.length >= 20) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap hookDecodeFileDescriptor(java.io.FileDescriptor r301, android.graphics.Rect r302, android.graphics.BitmapFactory.Options r303) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeFileDescriptor(java.io.FileDescriptor, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    public static Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        TypedValue typedValue = new TypedValue();
        Bitmap bitmap = null;
        try {
            InputStream openRawResource = resources.openRawResource(i, typedValue);
            try {
                bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, null, options);
                if (openRawResource != null) {
                    openRawResource.close();
                }
            } finally {
            }
        } catch (Exception unused) {
        }
        if (bitmap != null || options == null || options.inBitmap == null) {
            return bitmap;
        }
        throw AnonymousClass001.A0L("Problem decoding into existing bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (r307 != ((char) (-1))) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap hookDecodeResourceStream(android.content.res.Resources r301, android.util.TypedValue r302, java.io.InputStream r303, android.graphics.Rect r304, android.graphics.BitmapFactory.Options r305) {
        /*
            r0 = r305
            if (r0 != 0) goto Lf
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r305 = r0
            r0 = r305
            r0.<init>()
        Lf:
            r0 = r305
            int r0 = r0.inDensity
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L36
            r0 = r302
            if (r0 == 0) goto L36
            r0 = r302
            int r0 = r0.density
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L62
            r0 = 160(0xa0, float:2.24E-43)
            r307 = r0
        L2f:
            r0 = r305
            r1 = r307
            r0.inDensity = r1
        L36:
            r0 = r305
            int r0 = r0.inTargetDensity
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L5a
            r0 = r301
            if (r0 == 0) goto L5a
            r0 = r301
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r308 = r0
            r0 = r308
            int r0 = r0.densityDpi
            r306 = r0
            r0 = r305
            r1 = r306
            r0.inTargetDensity = r1
        L5a:
            r0 = r303
            r1 = r304
            r2 = r305
            android.graphics.Bitmap r0 = hookDecodeStream(r0, r1, r2)
            return r0
        L62:
            r0 = -1
            char r0 = (char) r0
            r306 = r0
            r0 = r307
            r1 = r306
            if (r0 == r1) goto L36
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeResourceStream(android.content.res.Resources, android.util.TypedValue, java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        0L4.A00();
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 20);
        }
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    public static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    public static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    public static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    public static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    public static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    public static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    public static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    public static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    public static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    public static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    public static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    public static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    public static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    public static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }
}
