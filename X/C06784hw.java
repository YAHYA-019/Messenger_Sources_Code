package X;

/* renamed from: X.4hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4hw.class */
public final class C06784hw implements InterfaceC06794hx {
    public static final InterfaceC06794hx A03;
    public int A00;
    public boolean A01;
    public boolean A02;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.4hw, X.4hx, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A00 = (-1) >>> 1;
        obj.A02 = true;
        obj.A01 = true;
        A03 = obj;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof C06784hw)) {
                return false;
            }
            C06784hw c06784hw = (C06784hw) obj;
            if (this.A00 == c06784hw.A00 && this.A02 == c06784hw.A02 && this.A01 == c06784hw.A01) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = 0;
        int i3 = 0;
        if (this.A02) {
            i3 = 4194304;
        }
        int i4 = i ^ i3;
        if (this.A01) {
            i2 = 8388608;
        }
        return i4 ^ i2;
    }
}
