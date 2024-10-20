package X;

/* renamed from: X.3Su, reason: invalid class name */
/* loaded from: 3Su.class */
public final class C3Su {
    public final /* synthetic */ C2C2 A04;
    public int A01 = 0;
    public boolean A03 = false;
    public int A00 = 0;
    public boolean A02 = false;

    public C3Su(C2C2 c2c2) {
        this.A04 = c2c2;
    }

    public static void A00(C3Su c3Su, int i) {
        synchronized (c3Su) {
            c3Su.A00 = i;
            c3Su.A02 = true;
        }
    }

    public static void A01(C3Su c3Su, int i) {
        synchronized (c3Su) {
            c3Su.A01 = i;
            c3Su.A03 = true;
        }
    }
}
