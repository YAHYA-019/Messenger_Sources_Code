package com.facebook.spectrum.options;

import X.AnonymousClass001;
import com.facebook.spectrum.requirements.CropRequirement;
import com.facebook.spectrum.requirements.ResizeRequirement;
import com.facebook.spectrum.requirements.RotateRequirement;

/* loaded from: Transformations.class */
public final class Transformations {
    public final CropRequirement cropRequirement;
    public final ResizeRequirement resizeRequirement;
    public final RotateRequirement rotateRequirement;

    public Transformations(ResizeRequirement resizeRequirement, CropRequirement cropRequirement, RotateRequirement rotateRequirement) {
        this.resizeRequirement = resizeRequirement;
        this.cropRequirement = cropRequirement;
        this.rotateRequirement = rotateRequirement;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Transformations transformations = (Transformations) obj;
            ResizeRequirement resizeRequirement = this.resizeRequirement;
            ResizeRequirement resizeRequirement2 = transformations.resizeRequirement;
            if (resizeRequirement != null) {
                if (!resizeRequirement.equals(resizeRequirement2)) {
                    return false;
                }
            } else if (resizeRequirement2 != null) {
                return false;
            }
            CropRequirement cropRequirement = this.cropRequirement;
            CropRequirement cropRequirement2 = transformations.cropRequirement;
            if (cropRequirement != null) {
                if (!cropRequirement.equals(cropRequirement2)) {
                    return false;
                }
            } else if (cropRequirement2 != null) {
                return false;
            }
            RotateRequirement rotateRequirement = this.rotateRequirement;
            RotateRequirement rotateRequirement2 = transformations.rotateRequirement;
            if (rotateRequirement != null) {
                return rotateRequirement.equals(rotateRequirement2);
            }
            if (rotateRequirement2 != null) {
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
        A0k.append("Transformations{resizeRequirement=");
        A0k.append(this.resizeRequirement);
        A0k.append(", cropRequirement=");
        A0k.append(this.cropRequirement);
        A0k.append(", rotateRequirement=");
        A0k.append(this.rotateRequirement);
        return AnonymousClass001.A0f(A0k);
    }
}
