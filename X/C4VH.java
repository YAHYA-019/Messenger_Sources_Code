package X;

/* renamed from: X.4VH, reason: invalid class name */
/* loaded from: 4VH.class */
public final class C4VH {
    public static final C4VH A03 = new C4VH();
    public final long A00;
    public final 1Pr A01;
    public final boolean A02;

    public C4VH() {
        this.A01 = new 1Pr();
        this.A00 = 0L;
        this.A02 = false;
    }

    public C4VH(1Pr r302, long j, boolean z) {
        this.A01 = r302;
        this.A00 = j;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C4VH) {
                C4VH c4vh = (C4VH) obj;
                if (this.A01.equals(c4vh.A01) && this.A00 == c4vh.A00 && this.A02 == c4vh.A02) {
                    z = true;
                }
            }
        }
        return z;
    }
}
