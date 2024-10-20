package X;

/* renamed from: X.3xW, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3xW.class */
public final class C03183xW {
    public final boolean A00;
    public final boolean A01;

    public C03183xW() {
        this(true, false);
    }

    public C03183xW(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!11T.A0O(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            11T.A0I(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.nativecode.CircularBitmapTransformation");
            C03183xW c03183xW = (C03183xW) obj;
            if (this.A00 == c03183xW.A00 && this.A01 == c03183xW.A01) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CircularBitmapTransformation(isAntiAliased=");
        A0k.append(this.A00);
        A0k.append(", useFastNativeRounding=");
        A0k.append(this.A01);
        return AnonymousClass001.A0g(A0k, ')');
    }
}
