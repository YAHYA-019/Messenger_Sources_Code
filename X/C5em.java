package X;

/* renamed from: X.5em, reason: invalid class name */
/* loaded from: 5em.class */
public final class C5em {
    public final float A00;
    public final float A01;
    public final int A02;
    public final boolean A03;

    public C5em(float f, float f2, int i, boolean z) {
        this.A02 = i;
        this.A01 = f;
        this.A00 = f2;
        this.A03 = z;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!11T.A0O(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            11T.A0I(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.options.BorderOptions");
            C5em c5em = (C5em) obj;
            if (this.A02 == c5em.A02 && this.A01 == c5em.A01 && this.A00 == c5em.A00 && this.A03 == c5em.A03) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int floatToIntBits = ((((this.A02 * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A00)) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return floatToIntBits + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BorderOptions(color=");
        A0k.append(this.A02);
        A0k.append(", width=");
        A0k.append(this.A01);
        A0k.append(", padding=");
        A0k.append(this.A00);
        A0k.append(", scaleDownInsideBorders=");
        A0k.append(this.A03);
        return 4YV.A0x(A0k);
    }
}
