package X;

/* renamed from: X.9ez, reason: invalid class name */
/* loaded from: 9ez.class */
public final class C9ez {
    public final 1Br A00 = 1Bq.A00(16772);

    public static final void A00(C9ez c9ez, String str, String str2) {
        C1kw c1kw = (C1kw) 1Br.A0B(c9ez.A00);
        if (8EJ.A00 == null) {
            synchronized (8EJ.class) {
                if (8EJ.A00 == null) {
                    8EJ.A00 = new C2J3(c1kw);
                }
            }
        }
        AbstractC01593ro A3u = 8EJ.A00.A00.A3u(str, false);
        if (A3u.A0B()) {
            A3u.A06("bump_type", str2);
            A3u.A0A();
        }
    }
}
