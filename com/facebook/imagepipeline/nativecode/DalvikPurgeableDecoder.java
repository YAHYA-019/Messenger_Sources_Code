package com.facebook.imagepipeline.nativecode;

import X.0Q8;
import X.11T;
import X.2Ds;
import X.2EU;
import X.2Ft;
import X.2H0;
import X.2H1;
import X.C0cl;
import X.C0gh;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import java.util.Locale;

/* loaded from: DalvikPurgeableDecoder.class */
public abstract class DalvikPurgeableDecoder implements 2Ft {
    public static final byte[] EOI;
    public final 2H1 mUnpooledBitmapsCounter;

    static {
        C0gh.A02("imagepipeline");
        EOI = new byte[]{-1, -39};
    }

    public DalvikPurgeableDecoder() {
        if (2H0.A01 == null) {
            synchronized (2H0.class) {
                if (2H0.A01 == null) {
                    2H0.A01 = new 2H1(2H0.A00);
                }
            }
        }
        2H1 r0 = 2H0.A01;
        11T.A0D(r0);
        this.mUnpooledBitmapsCounter = r0;
    }

    public static void A00(BitmapFactory.Options options, ColorSpace colorSpace) {
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
    }

    public static native void nativePinBitmap(Bitmap bitmap);

    public abstract Bitmap decodeByteArrayAsPurgeable(2EU r1, BitmapFactory.Options options);

    public 2EU decodeFromEncodedImage(2Ds r302, Bitmap.Config config, Rect rect) {
        return decodeFromEncodedImageWithColorSpace(r302, config, null, null);
    }

    public 2EU decodeFromEncodedImageWithColorSpace(2Ds r302, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        int i = r302.A03;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        A00(options, colorSpace);
        2EU r0 = r302.A0C;
        2EU A08 = r0 != null ? r0.A08() : null;
        A08.getClass();
        try {
            return pinBitmap(decodeByteArrayAsPurgeable(A08, options));
        } finally {
            A08.close();
        }
    }

    public abstract Bitmap decodeJPEGByteArrayAsPurgeable(2EU r1, int i, BitmapFactory.Options options);

    public 2EU decodeJPEGFromEncodedImageWithColorSpace(2Ds r302, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        int i2 = r302.A03;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i2;
        options.inMutable = true;
        A00(options, colorSpace);
        2EU r0 = r302.A0C;
        2EU A08 = r0 != null ? r0.A08() : null;
        A08.getClass();
        try {
            return pinBitmap(decodeJPEGByteArrayAsPurgeable(A08, i, options));
        } finally {
            A08.close();
        }
    }

    public 2EU pinBitmap(Bitmap bitmap) {
        int byteCount;
        boolean z;
        int byteCount2;
        int i;
        long j;
        int i2;
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            2H1 r0 = this.mUnpooledBitmapsCounter;
            synchronized (r0) {
                try {
                    byteCount = bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                    byteCount = bitmap.getByteCount();
                }
                int i3 = r0.A00;
                if (i3 < 384) {
                    long j2 = r0.A01 + byteCount;
                    if (j2 <= r0.A02) {
                        z = true;
                        r0.A00 = i3 + 1;
                        r0.A01 = j2;
                    }
                }
                z = false;
            }
            if (z) {
                return 2EU.A01(2EU.A05, this.mUnpooledBitmapsCounter.A03, bitmap);
            }
            try {
                byteCount2 = bitmap.getAllocationByteCount();
            } catch (NullPointerException unused2) {
                byteCount2 = bitmap.getByteCount();
            }
            bitmap.recycle();
            Locale locale = Locale.US;
            Integer valueOf = Integer.valueOf(byteCount2);
            2H1 r314 = this.mUnpooledBitmapsCounter;
            synchronized (r314) {
                try {
                    i = r314.A00;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Integer valueOf2 = Integer.valueOf(i);
            2H1 r02 = this.mUnpooledBitmapsCounter;
            synchronized (r02) {
                j = r02.A01;
            }
            Long valueOf3 = Long.valueOf(j);
            synchronized (this.mUnpooledBitmapsCounter) {
            }
            r314 = this.mUnpooledBitmapsCounter;
            synchronized (r314) {
                i2 = r314.A02;
            }
            throw new RuntimeException(String.format(locale, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", valueOf, valueOf2, valueOf3, 384, Integer.valueOf(i2)));
        } catch (Exception e) {
            bitmap.recycle();
            C0cl.A00(e);
            throw 0Q8.createAndThrow();
        }
    }
}
