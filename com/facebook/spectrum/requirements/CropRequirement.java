package com.facebook.spectrum.requirements;

import X.1BL;
import X.AnonymousClass001;
import X.HLB;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: CropRequirement.class */
public abstract class CropRequirement {
    public final boolean mustBeExact;

    /* loaded from: CropRequirement$CropAbsoluteToOriginRequirement.class */
    public final class CropAbsoluteToOriginRequirement extends CropRequirement {
        public final int bottom;
        public final int left;
        public final int right;
        public final int top;

        public CropAbsoluteToOriginRequirement(int i, int i2, int i3, int i4, boolean z) {
            super(z);
            boolean z2 = true;
            HLB.A00(1BL.A1S(i));
            HLB.A00(1BL.A1S(i2));
            HLB.A00(1BL.A1S(i3));
            HLB.A00(1BL.A1S(i4));
            HLB.A00(AnonymousClass001.A1R(i, i3));
            HLB.A00(i2 >= i4 ? false : z2);
            this.left = i;
            this.top = i2;
            this.right = i3;
            this.bottom = i4;
        }

        @Override // com.facebook.spectrum.requirements.CropRequirement
        public boolean equals(Object obj) {
            boolean z = true;
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                CropAbsoluteToOriginRequirement cropAbsoluteToOriginRequirement = (CropAbsoluteToOriginRequirement) obj;
                if (!super.equals(obj) || this.left != cropAbsoluteToOriginRequirement.left || this.top != cropAbsoluteToOriginRequirement.top || this.right == cropAbsoluteToOriginRequirement.right) {
                    return false;
                }
                if (this.bottom == cropAbsoluteToOriginRequirement.bottom) {
                    z = false;
                }
            }
            return z;
        }

        public int hashCode() {
            return 0;
        }

        @Override // com.facebook.spectrum.requirements.CropRequirement
        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("CropAbsoluteToOriginRequirement{mustBeExact=");
            A0k.append(this.mustBeExact);
            A0k.append(", left=");
            A0k.append(this.left);
            A0k.append(", top=");
            A0k.append(this.top);
            A0k.append(", right=");
            A0k.append(this.right);
            A0k.append(", bottom=");
            A0k.append(this.bottom);
            return AnonymousClass001.A0f(A0k);
        }
    }

    /* loaded from: CropRequirement$CropRelativeToOriginRequirement.class */
    public final class CropRelativeToOriginRequirement extends CropRequirement {
        public final float bottom;
        public final float left;
        public final float right;
        public final float top;

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0072, code lost:
        
            if (r304 > 1.0d) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
        
            if (r305 > 1.0d) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
        
            if (r302 > 1.0d) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x004d, code lost:
        
            if (r303 > 1.0d) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public CropRelativeToOriginRequirement(float r302, float r303, float r304, float r305, boolean r306) {
            /*
                Method dump skipped, instructions count: 214
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.spectrum.requirements.CropRequirement.CropRelativeToOriginRequirement.<init>(float, float, float, float, boolean):void");
        }

        @Override // com.facebook.spectrum.requirements.CropRequirement
        public boolean equals(Object obj) {
            boolean z = true;
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                CropRelativeToOriginRequirement cropRelativeToOriginRequirement = (CropRelativeToOriginRequirement) obj;
                if (!super.equals(obj) || Float.compare(cropRelativeToOriginRequirement.left, this.left) != 0 || Float.compare(cropRelativeToOriginRequirement.top, this.top) != 0 || Float.compare(cropRelativeToOriginRequirement.right, this.right) != 0) {
                    return false;
                }
                if (Float.compare(cropRelativeToOriginRequirement.bottom, this.bottom) != 0) {
                    z = false;
                }
            }
            return z;
        }

        public int hashCode() {
            return 0;
        }

        @Override // com.facebook.spectrum.requirements.CropRequirement
        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("CropRelativeToOriginRequirement{mustBeExact=");
            A0k.append(this.mustBeExact);
            A0k.append(", left=");
            A0k.append(this.left);
            A0k.append(", top=");
            A0k.append(this.top);
            A0k.append(", right=");
            A0k.append(this.right);
            A0k.append(", bottom=");
            A0k.append(this.bottom);
            return AnonymousClass001.A0f(A0k);
        }
    }

    public CropRequirement(boolean z) {
        this.mustBeExact = z;
    }

    public static CropRequirement makeAbsoluteToOrigin(int i, int i2, int i3, int i4, boolean z) {
        return new CropAbsoluteToOriginRequirement(i, i2, i3, i4, z);
    }

    public static CropRequirement makeAbsoluteToOrigin(Rect rect, boolean z) {
        return makeAbsoluteToOrigin(rect.left, rect.top, rect.right, rect.bottom, z);
    }

    public static CropRequirement makeRelativeToOrigin(float f, float f2, float f3, float f4, boolean z) {
        return new CropRelativeToOriginRequirement(f, f2, f3, f4, z);
    }

    public static CropRequirement makeRelativeToOrigin(RectF rectF, boolean z) {
        return makeRelativeToOrigin(rectF.left, rectF.top, rectF.right, rectF.bottom, z);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (this.mustBeExact != ((CropRequirement) obj).mustBeExact) {
                z = false;
            }
        }
        return z;
    }

    public abstract String toString();
}
