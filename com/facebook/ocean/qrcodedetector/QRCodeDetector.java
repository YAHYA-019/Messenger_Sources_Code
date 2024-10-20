package com.facebook.ocean.qrcodedetector;

import X.C0il;
import android.graphics.Bitmap;

/* loaded from: QRCodeDetector.class */
public final class QRCodeDetector {
    public static final QRCodeDetector INSTANCE = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ocean.qrcodedetector.QRCodeDetector, java.lang.Object] */
    static {
        C0il.A0B("oceanqrcodedetectorjni");
    }

    public static final native String[] detectQRCodes(Bitmap bitmap);

    public static final native String[] detectQRCodesY8(byte[] bArr, int i, int i2, int i3);
}
