package com.facebook.spectrum.requirements;

import X.AnonymousClass001;

/* loaded from: RotateRequirement.class */
public class RotateRequirement {
    public final int degrees;
    public final boolean flipHorizontally;
    public final boolean flipVertically;
    public final boolean forceUpOrientation;

    public RotateRequirement(int i) {
        this(i, false, false, false);
    }

    public RotateRequirement(int i, boolean z, boolean z2, boolean z3) {
        this.degrees = i;
        this.flipHorizontally = z;
        this.flipVertically = z2;
        this.forceUpOrientation = z3;
    }

    public RotateRequirement(boolean z) {
        this(0, false, false, z);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RotateRequirement rotateRequirement = (RotateRequirement) obj;
            if (this.degrees != rotateRequirement.degrees || this.flipHorizontally != rotateRequirement.flipHorizontally || this.flipVertically != rotateRequirement.flipVertically) {
                return false;
            }
            if (this.forceUpOrientation != rotateRequirement.forceUpOrientation) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RotateRequirement{degrees=");
        A0k.append(this.degrees);
        A0k.append(", flipHorizontally=");
        A0k.append(this.flipHorizontally);
        A0k.append(", flipVertically=");
        A0k.append(this.flipVertically);
        A0k.append(", forceUpOrientation=");
        A0k.append(this.forceUpOrientation);
        return AnonymousClass001.A0f(A0k);
    }
}
