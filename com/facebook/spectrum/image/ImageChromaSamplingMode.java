package com.facebook.spectrum.image;

import X.AnonymousClass001;

/* loaded from: ImageChromaSamplingMode.class */
public enum ImageChromaSamplingMode {
    S444(0),
    S420(1),
    S422(2),
    S411(3),
    S440(4);

    public final int value;

    ImageChromaSamplingMode(int i) {
        this.value = i;
    }

    public static ImageChromaSamplingMode from(int i) {
        ImageChromaSamplingMode[] values = values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                throw AnonymousClass001.A0L("Unsupported ChromaSamplingMode");
            }
            ImageChromaSamplingMode imageChromaSamplingMode = values[i3];
            if (i == imageChromaSamplingMode.value) {
                return imageChromaSamplingMode;
            }
            i2 = i3 + 1;
        }
    }
}
