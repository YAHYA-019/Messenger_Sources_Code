package com.facebook.spectrum.image;

import X.AnonymousClass001;

/* loaded from: ImageOrientation.class */
public enum ImageOrientation {
    UP(1),
    UP_MIRRORED(2),
    BOTTOM(3),
    BOTTOM_MIRRORED(4),
    LEFT_MIRRORED(5),
    RIGHT(6),
    RIGHT_MIRRORED(7),
    LEFT(8);

    public final short value;

    ImageOrientation(short s) {
        this.value = s;
    }

    public static ImageOrientation from(short s) {
        ImageOrientation[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw AnonymousClass001.A0L("Unsupported ImageOrientation");
            }
            ImageOrientation imageOrientation = values[i2];
            if (imageOrientation.value == s) {
                return imageOrientation;
            }
            i = i2 + 1;
        }
    }
}
