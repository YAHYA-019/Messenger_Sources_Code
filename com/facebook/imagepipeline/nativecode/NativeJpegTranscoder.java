package com.facebook.imagepipeline.nativecode;

import X.0CS;
import X.1BK;
import X.2Ds;
import X.2GE;
import X.4hB;
import X.4hC;
import X.4sB;
import X.AbstractC05294de;
import X.AbstractC06744hs;
import X.AbstractC06764hu;
import X.C02353ux;
import X.C0By;
import X.C2rD;
import X.C5cg;
import android.graphics.ColorSpace;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: NativeJpegTranscoder.class */
public class NativeJpegTranscoder implements 4hB {
    public int mMaxBitmapSize;
    public boolean mResizingEnabled;
    public boolean mUseDownsamplingRatio;

    public static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    public static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    public boolean canResize(2Ds r302, C2rD c2rD, C02353ux c02353ux) {
        boolean z = false;
        if (AbstractC06744hs.A00(c02353ux, c2rD, r302, this.mResizingEnabled) < 8) {
            z = true;
        }
        return z;
    }

    public boolean canTranscode(2GE r302) {
        boolean z = false;
        if (r302 == AbstractC05294de.A05) {
            z = true;
        }
        return z;
    }

    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    /* JADX WARN: Type inference failed for: r0v76, types: [X.5cg] */
    public C5cg transcode(2Ds r302, OutputStream outputStream, C2rD c2rD, C02353ux c02353ux, 2GE r306, Integer num, ColorSpace colorSpace) {
        if (c2rD == null) {
            c2rD = C2rD.A02;
        }
        int A00 = AbstractC06764hu.A00(c02353ux, c2rD, r302, this.mMaxBitmapSize);
        try {
            int A002 = AbstractC06744hs.A00(c02353ux, c2rD, r302, this.mResizingEnabled);
            int max = Math.max(1, 8 / A00);
            if (this.mUseDownsamplingRatio) {
                A002 = max;
            }
            InputStream A06 = r302.A06();
            0CS r0 = AbstractC06744hs.A00;
            2Ds.A03(r302);
            if (r0.contains(Integer.valueOf(r302.A00))) {
                int A01 = AbstractC06744hs.A01(c2rD, r302);
                C0By.A03(A06, "Cannot transcode from null input stream!");
                4hC.A00();
                boolean z = false;
                boolean z2 = false;
                if (A002 >= 1) {
                    z2 = true;
                }
                1BK.A1S(z2);
                boolean z3 = false;
                if (A002 <= 16) {
                    z3 = true;
                }
                1BK.A1S(z3);
                boolean z4 = true;
                switch (A01) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        z4 = false;
                        break;
                }
                1BK.A1S(z4);
                if (A002 != 8 || A01 != 1) {
                    z = true;
                }
                C0By.A05(z, "no transformation requested");
                A06.getClass();
                nativeTranscodeJpegWithExifOrientation(A06, outputStream, A01, A002, 85);
            } else {
                int A02 = AbstractC06744hs.A02(c2rD, r302);
                C0By.A03(A06, "Cannot transcode from null input stream!");
                4hC.A00();
                boolean z5 = false;
                boolean z6 = false;
                if (A002 >= 1) {
                    z6 = true;
                }
                C0By.A02(Boolean.valueOf(z6));
                boolean z7 = false;
                if (A002 <= 16) {
                    z7 = true;
                }
                C0By.A02(Boolean.valueOf(z7));
                boolean z8 = true;
                if (A02 < 0 || A02 > 270 || A02 % 90 != 0) {
                    z8 = false;
                }
                C0By.A02(Boolean.valueOf(z8));
                if (A002 != 8 || A02 != 0) {
                    z5 = true;
                }
                C0By.A05(z5, "no transformation requested");
                A06.getClass();
                nativeTranscodeJpeg(A06, outputStream, A02, A002, 85);
            }
            4sB.A01(A06);
            int i = 1;
            if (A00 != 1) {
                i = 0;
            }
            final int i2 = i;
            return new Object(i2) { // from class: X.5cg
                public final int A00;

                {
                    this.A00 = i2;
                }

                public String toString() {
                    String format = String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.A00)}, 1));
                    11T.A0A(format);
                    return format;
                }
            };
        } catch (Throwable th) {
            4sB.A01((InputStream) null);
            throw th;
        }
    }
}
