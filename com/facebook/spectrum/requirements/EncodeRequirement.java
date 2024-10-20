package com.facebook.spectrum.requirements;

import X.AnonymousClass001;
import com.facebook.spectrum.image.EncodedImageFormat;

/* loaded from: EncodeRequirement.class */
public class EncodeRequirement {
    public final EncodedImageFormat format;
    public final Mode mode;
    public final int quality;

    /* loaded from: EncodeRequirement$Mode.class */
    public enum Mode {
        LOSSLESS(0),
        LOSSY(1),
        ANY(2);

        public final int value;

        Mode(int i) {
            this.value = i;
        }

        public static Mode from(int i) {
            Mode[] values = values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    throw AnonymousClass001.A0L("Unsupported EncodeRequirement.Mode");
                }
                Mode mode = values[i3];
                if (mode.value == i) {
                    return mode;
                }
                i2 = i3 + 1;
            }
        }
    }

    public EncodeRequirement(EncodedImageFormat encodedImageFormat) {
        this(encodedImageFormat, Mode.ANY);
    }

    public EncodeRequirement(EncodedImageFormat encodedImageFormat, int i) {
        this(encodedImageFormat, i, Mode.ANY);
    }

    public EncodeRequirement(EncodedImageFormat encodedImageFormat, int i, Mode mode) {
        this.format = encodedImageFormat;
        this.quality = i;
        this.mode = mode;
    }

    public EncodeRequirement(EncodedImageFormat encodedImageFormat, Mode mode) {
        this(encodedImageFormat, 0, mode);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EncodeRequirement) {
                EncodeRequirement encodeRequirement = (EncodeRequirement) obj;
                if (this.format.equals(encodeRequirement.format) && this.quality == encodeRequirement.quality && this.mode == encodeRequirement.mode) {
                    z = true;
                }
            }
        }
        return z;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EncodeRequirement{format=");
        A0k.append(this.format.identifier);
        A0k.append(", quality=");
        A0k.append(this.quality);
        A0k.append(", mode=");
        A0k.append(this.mode);
        return AnonymousClass001.A0f(A0k);
    }
}
