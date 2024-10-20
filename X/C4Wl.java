package X;

/* renamed from: X.4Wl, reason: invalid class name */
/* loaded from: 4Wl.class */
public final class C4Wl implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C4Wl(int i, int i2, String str, String str2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C4Wl c4Wl = (C4Wl) obj;
        11T.A0F(c4Wl, 0);
        int i = this.A00 - c4Wl.A00;
        if (i == 0) {
            i = this.A01 - c4Wl.A01;
        }
        return i;
    }
}
