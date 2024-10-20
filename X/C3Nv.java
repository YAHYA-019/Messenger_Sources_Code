package X;

/* renamed from: X.3Nv, reason: invalid class name */
/* loaded from: 3Nv.class */
public final class C3Nv {
    public final C33g A02 = new C2J3();
    public final C00i A00 = 1BQ.A02(17137);
    public final C00i A01 = 1BV.A00(99713);

    public void A00(3TI r302) {
        C3Og c3Og;
        if (r302 != null) {
            C2w2 c2w2 = (C2w2) this.A00.get();
            synchronized (c2w2) {
                C3Og c3Og2 = c2w2.A02;
                if (c3Og2 == null || !c3Og2.A05()) {
                    C3Og c3Og3 = c2w2.A00;
                    if (c3Og3 != null && c3Og3.A05()) {
                        c3Og = c2w2.A00;
                    }
                } else {
                    c3Og = c2w2.A02;
                }
                if (c3Og != null) {
                    c3Og.A00.put("is_open_application", new 33Y("is_open_application"));
                }
            }
            33Y r0 = new 33Y("is_open_application");
            if (r302.A03 != null) {
                synchronized (r302) {
                    r302.A02.put(((3OU) r0).A00, r0);
                }
            }
        }
    }
}
