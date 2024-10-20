package com.facebook.spectrum.requirements;

import X.AnonymousClass001;
import X.HLB;
import com.facebook.spectrum.image.ImageSize;

/* loaded from: ResizeRequirement.class */
public class ResizeRequirement {
    public final Mode mode;
    public final ImageSize targetSize;

    /* loaded from: ResizeRequirement$Mode.class */
    public enum Mode {
        EXACT(0),
        EXACT_OR_SMALLER(1),
        EXACT_OR_LARGER(2);

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
                    throw AnonymousClass001.A0L("Unsupported Mode");
                }
                Mode mode = values[i3];
                if (mode.value == i) {
                    return mode;
                }
                i2 = i3 + 1;
            }
        }
    }

    public ResizeRequirement(Mode mode, ImageSize imageSize) {
        this.mode = mode;
        this.targetSize = imageSize;
        boolean z = true;
        HLB.A00(AnonymousClass001.A1P(imageSize.width));
        HLB.A00(imageSize.height <= 0 ? false : z);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ResizeRequirement resizeRequirement = (ResizeRequirement) obj;
            if (this.mode != resizeRequirement.mode) {
                return false;
            }
            ImageSize imageSize = this.targetSize;
            ImageSize imageSize2 = resizeRequirement.targetSize;
            if (imageSize != null) {
                z = imageSize.equals(imageSize2);
            } else if (imageSize2 != null) {
                return false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ResizeRequirement{mode=");
        A0k.append(this.mode);
        A0k.append(", targetSize=");
        A0k.append(this.targetSize);
        return AnonymousClass001.A0f(A0k);
    }
}
