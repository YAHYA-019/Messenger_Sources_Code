package com.facebook.imagepipeline.nativecode;

import X.2GE;
import X.2I8;
import X.4hB;
import X.4hC;
import X.AbstractC05294de;

/* loaded from: NativeJpegTranscoderFactory.class */
public class NativeJpegTranscoderFactory implements 2I8 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
    }

    /* JADX WARN: Type inference failed for: r305v0, types: [X.4hB, com.facebook.imagepipeline.nativecode.NativeJpegTranscoder, java.lang.Object] */
    public 4hB createImageTranscoder(2GE r302, boolean z) {
        4hB r305;
        if (r302 != AbstractC05294de.A05) {
            r305 = null;
        } else {
            int i = this.A00;
            boolean z2 = this.A02;
            boolean z3 = this.A01;
            ?? obj = new Object();
            obj.mResizingEnabled = z;
            obj.mMaxBitmapSize = i;
            obj.mUseDownsamplingRatio = z2;
            r305 = obj;
            if (z3) {
                4hC.A00();
                return obj;
            }
        }
        return r305;
    }
}
