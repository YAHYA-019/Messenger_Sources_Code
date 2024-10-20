package com.facebook.spectrum.image;

import X.0Pz;

/* loaded from: ImageSize.class */
public class ImageSize {
    public static final int MAX_IMAGE_SIDE_DIMENSION = 65536;
    public final int height;
    public final int width;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r302 > 65536) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ImageSize(int r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = 1
            r304 = r0
            r0 = 65536(0x10000, float:9.1835E-41)
            r305 = r0
            r0 = r302
            if (r0 < 0) goto L17
            r0 = 1
            r306 = r0
            r0 = r302
            r1 = r305
            if (r0 <= r1) goto L1a
        L17:
            r0 = 0
            r306 = r0
        L1a:
            r0 = r306
            X.HLB.A00(r0)
            r0 = r303
            if (r0 < 0) goto L38
            r0 = r303
            r1 = r305
            if (r0 > r1) goto L38
        L29:
            r0 = r304
            X.HLB.A00(r0)
            r0 = r301
            r1 = r302
            r0.width = r1
            r0 = r301
            r1 = r303
            r0.height = r1
            return
        L38:
            r0 = 0
            r304 = r0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.spectrum.image.ImageSize.<init>(int, int):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ImageSize imageSize = (ImageSize) obj;
            if (this.width != imageSize.width || this.height != imageSize.height) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public String toString() {
        return 0Pz.A0b("ImageSize{width=", ", height=", '}', this.width, this.height);
    }
}
